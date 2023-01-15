/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum TransactionStatusEnum {
    POST(100, "Done"),
    ADS(101, "Failed");

    private final Integer status;
    private final String description;

    TransactionStatusEnum(Integer type, String description) {
        this.status = type;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (TransactionStatusEnum typeEnum : TransactionStatusEnum.values()) {
            if (typeEnum.getStatus() == code) {
                return typeEnum.description;
            }
        }
        return null;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
