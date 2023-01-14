package com.avosh.baseproject.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(required = true)
    protected String name;
    protected int standard;
    @XmlElement(required = true)
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int value) {
        this.standard = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

}
