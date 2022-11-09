package com.avosh.baseproject.conf;


import com.avosh.baseproject.dto.SecUserDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class CustomUserDetail implements UserDetails {
    private SecUserDto secUser;

    public CustomUserDetail(SecUserDto secUser) {
        this.secUser = secUser;
    }

    public SecUserDto getSecUser() {
        return secUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));

    }

    @Override
    public String getPassword() {
        return secUser.getPassword();
    }

    @Override
    public String getUsername() {
        return secUser.getEmail();
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
        return secUser.getIsEnable();
    }
}
