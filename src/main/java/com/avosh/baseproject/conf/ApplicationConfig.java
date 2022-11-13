package com.avosh.baseproject.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ApplicationConfig {
    @Autowired
    private Environment env;

    public String detDevMode() {
        return env.getProperty("scom.avosh.dev");
    }
}
