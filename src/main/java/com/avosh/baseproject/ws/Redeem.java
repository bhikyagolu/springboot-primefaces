/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCods;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.RedeemService;
import com.avosh.baseproject.ws.model.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Redeem extends BaseWs{
    @Autowired
    private RedeemService redeemService;
    @PostMapping("/redeem")
    public ResponseEntity setRedeemForUser(@RequestHeader("authorization") String token, @PathVariable String redeemCode){
        HttpStatus httpStatus = HttpStatus.OK;
        TransactionResponse response = new TransactionResponse();
        try {
            if(!isTokenValid(token)){
                throw new TokenIsNotValidException();
            }
        } catch (TokenIsNotValidException e) {
            response.setResultCode(ResultCods.TOKEN_NOT_VALID.getCode());
            response.setResultDescription(ResultCods.TOKEN_NOT_VALID.getDescription());
            httpStatus = (ResultCods.TOKEN_NOT_VALID.getHttpStatus());
        } catch (Exception e) {
            response.setResultCode(ResultCods.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCods.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCods.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(response,httpStatus);
        }
    }
}