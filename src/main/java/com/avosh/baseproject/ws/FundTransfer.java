/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.TransactionService;
import com.avosh.baseproject.ws.model.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class FundTransfer extends BaseWs{
    @Autowired
    private TransactionService transactionService;
    @PostMapping("/transaction")
    public ResponseEntity getTransaction(@RequestHeader("authorization") String token, @RequestBody String body){
        HttpStatus httpStatus = HttpStatus.OK;
        TransactionResponse response = new TransactionResponse();
        try {
            if(!isTokenValid(token)){
                throw new TokenIsNotValidException();
            }
        } catch (TokenIsNotValidException e) {
            response.setResultCode(ResultCodsEnum.TOKEN_NOT_VALID.getCode());
            response.setResultDescription(ResultCodsEnum.TOKEN_NOT_VALID.getDescription());
            httpStatus = (ResultCodsEnum.TOKEN_NOT_VALID.getHttpStatus());
        } catch (Exception e) {
            response.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(response,httpStatus);
        }
    }
}
