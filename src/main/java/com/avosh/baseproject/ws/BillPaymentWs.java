package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.services.TransactionService;
import com.avosh.baseproject.ws.model.Response;
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
public class BillPaymentWs extends BaseWs {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/bill/payment")
    public ResponseEntity billPayment() {
        HttpStatus httpStatus = HttpStatus.OK;
        Response response = new Response();
        try {

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
