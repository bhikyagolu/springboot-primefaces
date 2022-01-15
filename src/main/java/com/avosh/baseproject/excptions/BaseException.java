package com.avosh.baseproject.excptions;

public class BaseException extends RuntimeException{
    public BaseException() {
    }

    public BaseException(String var1) {
        super(var1);
    }

    public BaseException(String var1, Throwable var2) {
        super(var1, var2);
    }

    public BaseException(Throwable var1) {
        super(var1);
    }
}