package com.avosh.baseproject.model.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StudentDetailsRequest" ,namespace = "http://www.avosh.com/xml/definitions")
public class StudentDetailsRequest {

    @XmlElement(required = true)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
