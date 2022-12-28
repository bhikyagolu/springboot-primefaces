package com.avosh.baseproject.enums;

import org.springframework.http.HttpStatus;

public enum ResultCods {
    SUCCESS(0, "Success",HttpStatus.OK),
    INTERNAL_ERROR(10201, "Internal Error",HttpStatus.OK),
    UNKNOWN_ERROR(10202, "Unknown Error",HttpStatus.OK),
    TOKEN_NOT_VALID(10203, "Token is not valid",HttpStatus.OK),
    REMOVE_ERROR(10204, "Remove Exception",HttpStatus.OK),
    USERNAME_PASSWORD_ERROR(10101, "Username or password is not valid",HttpStatus.UNAUTHORIZED),
    USER_IS_NOT_ENABLE(10102, "User is disabled",HttpStatus.OK),
    FAILURE(10109, "Failure",HttpStatus.OK);

    private Integer code;
    private String description;
    private HttpStatus httpStatus;

    ResultCods(Integer code, String description,HttpStatus httpStatus) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
