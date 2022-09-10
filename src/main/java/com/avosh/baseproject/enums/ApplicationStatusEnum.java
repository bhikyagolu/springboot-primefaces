/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum ApplicationStatusEnum {
    ENABLE(1,"Enable"),
    DISABLE(2,"Disable");

    private Integer stats;
    private String description;

    ApplicationStatusEnum(Integer stats, String description) {
        this.stats = stats;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (ApplicationStatusEnum statusEnum : ApplicationStatusEnum.values()) {
            if(statusEnum.getStats() == code){
                return statusEnum.description;
            }
        }
        return null;
    }

    public Integer getStats() {
        return stats;
    }

    public String getDescription() {
        return description;
    }
}
