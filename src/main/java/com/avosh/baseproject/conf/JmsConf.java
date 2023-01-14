package com.avosh.baseproject.conf;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.Message;

@EnableJms
@Configuration
@Profile("production")
public class JmsConf {
    private static final Logger log = Logger.getLogger(JmsConf.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "DEV.QUEUE.1")
    public void listener(Message message) {
        try {
            if (message instanceof javax.jms.TextMessage) {
                log.info(message.getBody(String.class));
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendJmsMessage(){
        jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello World!");
    }


}
