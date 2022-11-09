/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum ApplicationStatusEnum {
    ENABLE(1, "Enable"),
    DISABLE(2, "Disable");

    private Integer stats;
    private String description;

    ApplicationStatusEnum(Integer stats, String description) {
        this.stats = stats;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (ApplicationStatusEnum statusEnum : ApplicationStatusEnum.values()) {
            if (statusEnum.getStats() == code) {
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
