package com.avosh.baseproject.beans;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class DashboardBean extends BaseBean {
    Authentication authentication;
    CustomUserDetail customUserDetail;
    @Autowired
    DashboardService dashboardService;
    private String name;
    private String family;

    public DashboardBean() {
        authentication = SecurityContextHolder.getContext().getAuthentication();
        customUserDetail = (CustomUserDetail) authentication.getPrincipal();

    }

    public String getName() {
        return customUserDetail.getSecUser().getName();
    }

    public String getFamily() {
        return customUserDetail.getSecUser().getFamily();
    }

    public Integer allUserCount() {
        return 10;
    }

    public Integer allSalesCount() {
        return 10;
    }

    public Integer allRevenueCount() {
        return 10;
    }

    public Integer todayRegisterCount() {
        return 10;
    }

    public Integer todayViewCount() {
        return 10;
    }

    public Integer todayAndroidIncome() {
        return 10;
    }

    public Integer todayIosIncome() {
        return 10;
    }

    public Integer todayAllIncome() {
        return 20;
    }

    @Override
    public void init() {

    }
}
