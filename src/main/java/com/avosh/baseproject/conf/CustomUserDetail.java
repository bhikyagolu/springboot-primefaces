package com.avosh.baseproject.conf;


import com.avosh.baseproject.dto.RoleDto;
import com.avosh.baseproject.dto.SecUserDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetail implements UserDetails {
    private SecUserDto secUser;
    private List<RoleDto> roleDtos;

    public CustomUserDetail(SecUserDto secUser) {
        this.secUser = secUser;
    }
    public CustomUserDetail(SecUserDto secUser, List<RoleDto> roleDtos) {
        this.secUser = secUser;
        this.roleDtos = roleDtos;
    }

    public SecUserDto getSecUser() {
        return secUser;
    }

    public List<RoleDto> getRoleDtos() {
        return roleDtos;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
     List<GrantedAuthority> authorityList = new ArrayList<>();

        for (RoleDto dto: roleDtos) {
            authorityList.add(new SimpleGrantedAuthority(dto.getRole()));
        }
        return authorityList;

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
