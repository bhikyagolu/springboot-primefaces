package com.avosh.baseproject.beans;

import com.avosh.baseproject.conf.CustomUserDetail;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class DashboardBean extends BaseBean{
    private String name ;
    private String family;
    Authentication authentication;
    CustomUserDetail customUserDetail;

    public DashboardBean() {
        authentication = SecurityContextHolder.getContext().getAuthentication();
        customUserDetail = (CustomUserDetail)authentication.getPrincipal();

    }

    public String getName() {
        return customUserDetail.getSecUser().getName();
    }

    public String getFamily() {
        return customUserDetail.getSecUser().getFamily();
    }

    @Override
    public void insertRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
