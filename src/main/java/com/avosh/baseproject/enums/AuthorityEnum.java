package com.avosh.baseproject.enums;

public enum AuthorityEnum {
    LINK_PAY(1, "LINK_PAY");

    private Integer authority;
    private String description;

    AuthorityEnum(Integer authority, String description) {
        this.authority = authority;
        this.description = description;
    }

    public static String descriptionByAuthority(Integer authority) {
        for (AuthorityEnum authorityEnum : AuthorityEnum.values()) {
            if (authorityEnum.getAuthority() == authority) {
                return authorityEnum.description;
            }
        }
        return null;
    }

    public Integer getAuthority() {
        return authority;
    }

    public String getDescription() {
        return description;
    }
}
