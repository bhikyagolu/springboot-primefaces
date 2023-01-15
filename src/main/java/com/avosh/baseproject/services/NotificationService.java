package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.NotificationDto;
import com.avosh.baseproject.entity.Notification;
import com.avosh.baseproject.repository.NotificationRepository;

import java.util.List;

public interface NotificationService extends BaseService<NotificationRepository, Notification, NotificationDto> {
    List<NotificationDto> retrieveActiveNotifications();
}
