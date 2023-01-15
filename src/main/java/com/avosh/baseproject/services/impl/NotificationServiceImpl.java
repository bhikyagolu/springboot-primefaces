package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.NotificationDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Notification;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.NotificationRepository;
import com.avosh.baseproject.services.NotificationService;
import com.avosh.baseproject.util.Empty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class NotificationServiceImpl implements NotificationService {
    private static final Logger log = Logger.getLogger(NotificationServiceImpl.class);


    @Autowired
    NotificationRepository repository;

    @Override
    public void save(NotificationDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Notification notification = new Notification();
        if (Empty.isEmpty(dto.getCreateDate())) {
            notification.setCreateDate(new Date());
        } else {
            notification.setCreateDate(dto.getCreateDate());
        }
        notification.setTitle(dto.getTitle());
        notification.setDescription(dto.getDescription());
        notification.setSecUserId(new SecUser(auth.getSecUser().getId()));

        repository.save(notification);
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
            NotificationDto notificationDto = new NotificationDto(notification.getId(), userDto, notification.getTitle(),
                    notification.getDescription(), notification.getCreateDate(), notification.getUpdateDate(),
                    notification.getStartDate(), notification.getEndDate());
            list.add(notificationDto);

        }
        return list;
    }

    @Override
    public List<NotificationDto> retrieveActiveNotifications() {
        List<NotificationDto> list = new ArrayList<>();
        Iterable<Notification> itr = repository.readAllByEnableIsTrueAndEndDate(new Date());
        for (Notification notification : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(notification.getSecUserId().getId());
            userDto.setFamily(notification.getSecUserId().getFamily());
            userDto.setName(notification.getSecUserId().getName());
            NotificationDto notificationDto = new NotificationDto(notification.getId(), userDto, notification.getTitle(),
                    notification.getDescription(), notification.getCreateDate(), notification.getUpdateDate(),
                    notification.getStartDate(), notification.getEndDate());
            list.add(notificationDto);

        }
        return list;
    }

    @Override
    public NotificationDto retrieveById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
