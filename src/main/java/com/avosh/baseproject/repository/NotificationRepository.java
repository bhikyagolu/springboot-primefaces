package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.Notification;

import java.util.Date;
import java.util.List;

public interface NotificationRepository extends BaseRepository<Notification, Long> {
    List<Notification> findAllByEnableIsTrueAndEndDateBefore(Date EndDate);
}
