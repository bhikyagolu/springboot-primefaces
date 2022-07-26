package com.avosh.baseproject.services;

import com.avosh.baseproject.model.Email;

import javax.mail.MessagingException;



public interface EmailSenderService {
    public void sendHtmlMessage(Email email) throws MessagingException;
}
