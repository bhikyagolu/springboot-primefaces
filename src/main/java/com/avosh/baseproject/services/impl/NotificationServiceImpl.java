package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.NotificationDto;
import com.avosh.baseproject.repository.NotificationRepository;
import com.avosh.baseproject.services.NotificationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotificationServiceImpl implements NotificationService {
    private static final Logger log = Logger.getLogger(NotificationServiceImpl.class);


    @Autowired
    NotificationRepository repository;

    @Override
    public void save(NotificationDto dto) {

    }

    @Override
    public List<NotificationDto> retrieveAll() {
        return null;
    }
}
