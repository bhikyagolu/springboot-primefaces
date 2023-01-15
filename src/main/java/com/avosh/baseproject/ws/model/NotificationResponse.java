package com.avosh.baseproject.ws.model;

import java.util.List;

public class NotificationResponse extends Response {
    private List<Notification> notificationList;

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }
}
