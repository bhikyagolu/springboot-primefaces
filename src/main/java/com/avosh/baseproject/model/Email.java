package com.avosh.baseproject.model;


import io.swagger.v3.oas.annotations.media.Schema;


import java.util.Map;

public class Email {
    @Schema(example = "Amirkhani@gmail.com")
    String to;
    @Schema(example = "Amirkhani@gmail.com")
    String from;
    @Schema(example = "Welcome Email")
    String subject;
    @Schema(example = "Thank you.")
    String text;
    @Schema(example = "welcome-email.html")
    String template;
    @Schema(example = "{\n" +
            "\"name\": \"Ryan\",\n" +
            "\"subscriptionDate\": \"28-12-2022\",\n" +
            " \"technologies\": [\"java\", \"javascript\"]\n" +
            "}")
    Map<String, Object> properties;


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}