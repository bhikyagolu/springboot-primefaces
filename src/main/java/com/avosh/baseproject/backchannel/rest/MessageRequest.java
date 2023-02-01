package com.avosh.baseproject.backchannel.rest;


import com.avosh.baseproject.backchannel.model.Message;
import org.springframework.http.HttpMethod;


public abstract class MessageRequest extends Message {
    public abstract Class getResponseClass();

    public abstract HttpMethod getHttpMethod();

    public abstract String getUri();
}
