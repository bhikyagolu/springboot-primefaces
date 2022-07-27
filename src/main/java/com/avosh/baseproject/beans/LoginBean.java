package com.avosh.baseproject.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class LoginBean extends BaseBean{

    @Override
    public void insertRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
