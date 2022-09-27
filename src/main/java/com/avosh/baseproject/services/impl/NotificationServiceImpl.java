package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.NotificationDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.entity.Notification;
import com.avosh.baseproject.repository.NotificationRepository;
import com.avosh.baseproject.services.NotificationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    private static final Logger log = Logger.getLogger(NotificationServiceImpl.class);


    @Autowired
    NotificationRepository repository;

    @Override
    public void save(NotificationDto dto) {

    }

    @Override
    public List<NotificationDto> retrieveAll() {
        List<NotificationDto> list = new ArrayList<>();
        Iterable<Notification> itr = repository.findAll();
        for (Notification notification : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(notification.getSecUserId().getId());
            userDto.setFamily(notification.getSecUserId().getFamily());
            userDto.setName(notification.getSecUserId().getName());
            NotificationDto notificationDto = new NotificationDto(notification.getId(), userDto,notification.getTitle(),
                    notification.getDescription(),notification.getCreateDate(),notification.getUpdateDate(),
                    notification.getStartDate(),notification.getEndDate());
            list.add(notificationDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {

    }
}
