package com.baidu.iop.m4.config.audit;

import com.baidu.iop.m4.custom.audit.CustomAuditingEntityListener;
import com.baidu.iop.m4.custom.audit.SpringSecurityAuditorAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author mason
 */
@Configuration
@EnableJpaAuditing
public class AuditConfiguration {
    @Bean
    public CustomAuditingEntityListener auditingEntityListener(){
        return new CustomAuditingEntityListener();
    }

    @Bean
    public AuditorAware<String> auditorAware(){
        return new SpringSecurityAuditorAware();
    }
}
