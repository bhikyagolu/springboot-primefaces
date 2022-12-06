package com.avosh.baseproject.conf;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

@EnableJms
@Configuration
@Profile("dev")
public class JmsConf {
    private static final Logger log = Logger.getLogger(JmsConf.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "NOTIFICATION_SMS_QUEUE")
    public void listener(Object message) {
//        log.info("message received {}", message.toString());
        //do something
    }

    public void sendJmsMessage(){
        jmsTemplate.convertAndSend("NOTIFICATION_SMS_QUEUE", "Hello World!");
    }


}
