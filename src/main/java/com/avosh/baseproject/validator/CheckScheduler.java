package com.avosh.baseproject.validator;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface CheckScheduler {
    int schedulerId();

}