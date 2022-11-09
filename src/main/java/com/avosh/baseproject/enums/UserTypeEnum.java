/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum UserTypeEnum {
    ENABLE(1, "Admin"),
    ASSISTANT(2, "Assistant"),
    ORDINARY(3, "Ordinary");

    private Integer code;
    private String description;

    UserTypeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (UserTypeEnum statusEnum : UserTypeEnum.values()) {
            if (statusEnum.getCode() == code) {
                return statusEnum.description;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
