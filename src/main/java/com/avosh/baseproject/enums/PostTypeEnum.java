/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum PostTypeEnum {
    POST(1,"Post"),
    ADS(2,"Advertisement");

    private Integer type;
    private String description;

    PostTypeEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (PostTypeEnum typeEnum : PostTypeEnum.values()) {
            if(typeEnum.getType() == code){
                return typeEnum.description;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
