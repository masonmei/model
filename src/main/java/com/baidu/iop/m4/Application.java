package com.baidu.iop.m4;

import static com.baidu.iop.m4.utils.Constants.Profile.DEV;
import static com.baidu.iop.m4.utils.Constants.Profile.PROD;
import static com.baidu.iop.m4.utils.Constants.Profile.PROFILE_ARG;
import static com.baidu.iop.m4.utils.Constants.Profile.PROFILE_KEY;
import static com.baidu.iop.m4.utils.Constants.Profile.TEST;
import static com.baidu.iop.m4.utils.Constants.SERVER_PORT;

import com.baidu.iop.m4.utils.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SimpleCommandLinePropertySource;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 * @author mason
 */

@SpringBootApplication
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication application = new SpringApplication(Application.class);
        SimpleCommandLinePropertySource propertySource = new SimpleCommandLinePropertySource(args);
        setDefaultProfiles(application, propertySource);
        Environment env = application.run(args).getEnvironment();
        LOG.info("Application running information:\n"
                + "------------------------------------------------------------------\n"
                + "Address: {}\n"
                + "Port: {}\n"
                + "------------------------------------------------------------------",
                InetAddress.getLocalHost().getHostAddress(), env.getProperty(SERVER_PORT));
    }

    private static void setDefaultProfiles(SpringApplication application, SimpleCommandLinePropertySource source) {
        if (!source.containsProperty(PROFILE_ARG) && !System.getenv().containsKey(PROFILE_KEY)) {
            LOG.debug("No profile configured, use {} as default.", PROD);
            application.setAdditionalProfiles(DEV);
        }
    }

    @Autowired
    private Environment env;

    @PostConstruct
    public void initApplication() throws IOException {
        if (env.getActiveProfiles().length == 0) {
            LOG.warn("No Spring profile configured, running with the default configuration.");
        } else {
            LOG.info("Running with profile(s): {}", Arrays.toString(env.getActiveProfiles()));

            List<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
            if (activeProfiles.contains(DEV) && activeProfiles.contains(PROD)) {
                LOG.error("You have mis-configured your application! '{}' and '{}' profiles should never run at"
                        + " same time!", DEV, PROD);
            }

            if (activeProfiles.contains(DEV) && activeProfiles.contains(TEST)) {
                LOG.error("You have mis-configured your application! '{}' and '{}' profiles should never run at"
                        + " same time!", DEV, TEST);
            }

            if (activeProfiles.contains(TEST) && activeProfiles.contains(PROD)) {
                LOG.error("You have mis-configured your application! '{}' and '{}' profiles should never run at"
                        + " same time!", TEST, PROD);
            }
        }
    }
}
