package com.avosh.baseproject.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope("singleton")
public class ApplicationConfig implements Serializable {
    @Autowired
    private Environment env;

    public Boolean detDevMode() {
        return Boolean.getBoolean(env.getProperty("com.avosh.dev"));
    }

    public String getTempFilesPath() {
        return env.getProperty("temp.path");
    }
}
