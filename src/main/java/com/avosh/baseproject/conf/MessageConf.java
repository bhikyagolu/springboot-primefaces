package com.avosh.baseproject.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConf {

    @Bean
    public ResourceBundleMessageSource messageSource() {

        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("locale/message");
        source.setUseCodeAsDefaultMessage(true);

        return source;
    }
}