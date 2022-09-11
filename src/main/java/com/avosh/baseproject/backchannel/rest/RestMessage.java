package com.avosh.baseproject.backchannel.rest;

import java.io.Serializable;

public abstract class RestMessage implements Serializable {

    private String sequenceNumber;


    public abstract String getMessage();

    public abstract void setMessage(String message);


}
