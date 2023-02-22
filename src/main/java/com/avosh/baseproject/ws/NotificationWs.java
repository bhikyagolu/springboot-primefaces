package com.avosh.baseproject.ws;

import com.avosh.baseproject.dto.NotificationDto;
import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.NotificationService;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.Notification;
import com.avosh.baseproject.ws.model.NotificationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ws")
public class NotificationWs extends BaseWs {
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/notification")
    public ResponseEntity getNotification(@RequestHeader("token") String token) {
        HttpStatus httpStatus = HttpStatus.OK;
        NotificationResponse response = new NotificationResponse();
        try {

            List<NotificationDto> res = notificationService.retrieveActiveNotifications();
            List<Notification> resultList = new ArrayList<>();
            for (NotificationDto notification : res) {
                Notification notif = new Notification(notification.getTitle(), notification.getDescription());
                resultList.add(notif);
            }
            response.setNotificationList(resultList);
            response.setResultCode(ResultCodsEnum.SUCCESS.getCode());
            response.setResultDescription(ResultCodsEnum.SUCCESS.getDescription());
        } catch (TokenIsNotValidException e) {
            response.setResultCode(ResultCodsEnum.TOKEN_NOT_VALID.getCode());
            response.setResultDescription(ResultCodsEnum.TOKEN_NOT_VALID.getDescription());
            httpStatus = (ResultCodsEnum.TOKEN_NOT_VALID.getHttpStatus());
        } catch (Exception e) {
            response.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        } finally {
            return new ResponseEntity(response, httpStatus);
        }
    }
}
