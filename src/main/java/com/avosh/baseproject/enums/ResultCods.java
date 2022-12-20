package com.avosh.baseproject.enums;

public enum ResultCods {
    SUCCESS(0, "Success"),
    INTERNAL_ERROR(10201, "Internal Error"),
    FAILURE(10101, "Failure");

    private Integer code;
    private String description;

    ResultCods(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
