package com.avosh.baseproject.dto;

import java.io.Serializable;

public class RoleDto extends BaseDto {
    private String role;
    private String title;

    public RoleDto(String role, String title) {
        this.role = role;
        this.title = title;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
