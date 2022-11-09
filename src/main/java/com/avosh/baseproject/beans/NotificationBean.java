/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.NotificationDto;
import com.avosh.baseproject.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class NotificationBean extends BaseBean<NotificationService, NotificationDto> {
    private NotificationDto notificationDto;
    private Boolean hasScheduled;


    @Autowired
    public void setService(NotificationService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        setEditMode(false);
        hasScheduled = false;
        list = service.retrieveAll();
        notificationDto = new NotificationDto();
        setDto(new NotificationDto());
    }


    public void doSave() {
        super.save();
        init();
    }

    public void doDelete() {
        setDto(notificationDto);
        super.delete();
        init();
    }

    public void viewMode(Boolean flag) {
        if (!flag) {
            notificationDto = new NotificationDto();
            setDto(new NotificationDto());
        }
        setEditMode(flag);
    }


    public NotificationDto getNotificationDto() {
        return notificationDto;
    }

    public void setNotificationDto(NotificationDto notificationDto) {
        setDto(notificationDto);
        this.notificationDto = notificationDto;
    }

    public List<NotificationDto> getDtoList() {
        return list;
    }

    public Boolean getHasScheduled() {
        return hasScheduled;
    }

    public void setHasScheduled(Boolean hasScheduled) {
        this.hasScheduled = hasScheduled;
    }
}
