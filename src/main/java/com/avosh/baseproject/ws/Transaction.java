/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCods;
import com.avosh.baseproject.services.TransactionService;
import com.avosh.baseproject.ws.model.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Transaction extends BaseWs{
    @Autowired
    private TransactionService transactionService;
    @PostMapping("/transaction")
    public ResponseEntity getTransaction(@RequestHeader("authorization") String token, @RequestBody String body){
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
