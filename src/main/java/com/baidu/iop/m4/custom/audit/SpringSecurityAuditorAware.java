package com.baidu.iop.m4.custom.audit;

import com.baidu.iop.m4.utils.Constants;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author mason
 */
public class SpringSecurityAuditorAware implements AuditorAware<String> {

    @Override
    public String getCurrentAuditor() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null){
            return auth.getName();
        }

        return Constants.SYSTEM;
    }
}
