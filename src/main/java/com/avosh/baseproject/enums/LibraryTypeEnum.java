/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum LibraryTypeEnum {
    IMAGE(1, "Image"),
    VIDEO(2, "Video"),
    PDF(3, "PDF");

    private Integer type;
    private String description;

    LibraryTypeEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (LibraryTypeEnum typeEnum : LibraryTypeEnum.values()) {
            if (typeEnum.getType() == code) {
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
