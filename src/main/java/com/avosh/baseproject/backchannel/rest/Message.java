package com.avosh.baseproject.backchannel.rest;

import java.io.Serializable;

public abstract class Message implements Serializable {

    private String sequenceNumber;


    public abstract String getMessage();

    public abstract void setMessage(String message);


}
