package com.baidu.iop.m4.custom.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author mason
 */
public class AppUserDetails implements UserDetails {

    private String userId;

    private Collection<? extends GrantedAuthority> authorities;

    private List<String> roles;

    public AppUserDetails() {
        super();
    }

    public AppUserDetails(String userId, Collection<? extends GrantedAuthority> authorities) {
        super();
        this.userId = userId;
        this.authorities = authorities;
        this.roles = new ArrayList<>();
        for (GrantedAuthority authority : authorities) {
            this.roles.add(authority.getAuthority());
        }
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
