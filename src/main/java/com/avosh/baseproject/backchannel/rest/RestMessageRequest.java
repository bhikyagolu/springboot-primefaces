package com.avosh.baseproject.backchannel.rest;


import org.springframework.http.HttpMethod;


public abstract class RestMessageRequest extends RestMessage {
    public abstract Class getResponseClass();
    public abstract HttpMethod getHttpMethod();
    public abstract String getUri();
}
