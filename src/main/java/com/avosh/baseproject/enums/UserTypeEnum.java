/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum UserTypeEnum {
    ENABLE(1,"Admin"),
    ASSISTANT(2,"Assistant"),
    ORDINARY(3,"Ordinary");

    private Integer code;
    private String description;

    UserTypeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (UserTypeEnum statusEnum : UserTypeEnum.values()) {
            if(statusEnum.getCode() == code){
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
