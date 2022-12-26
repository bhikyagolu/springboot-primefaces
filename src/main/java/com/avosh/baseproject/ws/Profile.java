/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCods;
import com.avosh.baseproject.services.UserProfileService;
import com.avosh.baseproject.ws.model.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class Profile extends BaseWs{
    @Autowired
    private UserProfileService  profileService;
    @PostMapping("/profile")
    public ResponseEntity getUserProfile(@RequestHeader("authorization") String token){
        HttpStatus httpStatus = HttpStatus.OK;
        TransactionResponse response = new TransactionResponse();
        try {


        } catch (Exception e) {
            response.setResultCode(ResultCods.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCods.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCods.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(response,httpStatus);
        }
    }
}
