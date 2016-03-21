package com.baidu.iop.m4.config.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * @author mason
 */
@ConfigurationProperties(prefix = "third-party.uuap")
public class UuapProperties {

    @NotNull
    private String casUrlLogin;

    @NotNull
    private String casUrlLogout;

    @NotNull
    private String casUrlPrefix;

    @NotNull
    private String casServiceUrl;

    @NotNull
    private String appServiceHome;

    private String[] whiteList;

    public String getAppServiceHome() {
        return appServiceHome;
    }


    public String getCasUrlLogin() {
        return casUrlLogin;
    }

    public void setAppServiceHome(String appServiceHome) {
        this.appServiceHome = appServiceHome;
    }

    public void setCasUrlLogin(String casUrlLogin) {
        this.casUrlLogin = casUrlLogin;
    }

    public String getCasUrlLogout() {
        return casUrlLogout;
    }

    public void setCasUrlLogout(String casUrlLogout) {
        this.casUrlLogout = casUrlLogout;
    }

    public String getCasUrlPrefix() {
        return casUrlPrefix;
    }

    public void setCasUrlPrefix(String casUrlPrefix) {
        this.casUrlPrefix = casUrlPrefix;
    }

    public String getCasServiceUrl() {
        return casServiceUrl;
    }

    public void setCasServiceUrl(String casServiceUrl) {
        this.casServiceUrl = casServiceUrl;
    }

    public String[] getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String[] whiteList) {
        this.whiteList = whiteList;
    }
}
