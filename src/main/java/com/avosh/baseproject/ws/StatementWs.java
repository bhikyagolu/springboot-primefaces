package com.avosh.baseproject.ws;

import com.avosh.baseproject.dto.TransactionDto;
import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.services.TransactionService;
import com.avosh.baseproject.ws.model.StatementRequest;
import com.avosh.baseproject.ws.model.Transaction;
import com.avosh.baseproject.ws.model.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ws")
public class StatementWs extends BaseWs {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/account/statement")
    public ResponseEntity getStatement(@RequestHeader("authorization") String token, @RequestBody StatementRequest body) {
        HttpStatus httpStatus = HttpStatus.OK;
        TransactionResponse response = new TransactionResponse();
        List<Transaction> transactionList = new ArrayList<>();
        try {
            if (!tokenService.isTokenValid(token)) {
                throw new TokenIsNotValidException();
            }
            Pageable paging = PageRequest.of(body.getPage(), body.getSize());
            List<TransactionDto> res = transactionService.retrieveTransactionsByUserToken(paging,token);
            for (TransactionDto dto:res) {
                Transaction transaction = new Transaction();
                transaction.setAmount(dto.getAmount());
                transaction.setDesc(dto.getDesc());
                transaction.setId(dto.getId());
                transaction.setStatus(dto.getStatus());
                transaction.setCreateDatetime(dto.getCreateDateTime());
                transactionList.add(transaction);
            }
            response.setTransactionList(transactionList);
            response.setResultCode(ResultCodsEnum.SUCCESS.getCode());
            response.setResultDescription(ResultCodsEnum.SUCCESS.getDescription());
            httpStatus = (ResultCodsEnum.SUCCESS.getHttpStatus());
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
