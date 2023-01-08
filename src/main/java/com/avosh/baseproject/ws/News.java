/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.NewsService;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.NewsDetailResponse;
import com.avosh.baseproject.ws.model.NewsRequest;
import com.avosh.baseproject.ws.model.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class News extends BaseWs{
    @Autowired
    private NewsService newsService;
    @Autowired
    private TokenService tokenService;
    @PostMapping("/news")
    public ResponseEntity getNews(@RequestHeader("authorization") String token, @RequestBody NewsRequest body){
        NewsResponse response = new NewsResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            if(!tokenService.isTokenValid(token)){
                throw new TokenIsNotValidException();
            }


        } catch (Exception e) {
            response.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(response,httpStatus);
        }


    }

    @PostMapping("/news/detail")
    public ResponseEntity getNewsDetail(@RequestHeader("authorization") String token, @RequestBody NewsRequest body){
        NewsDetailResponse response = new NewsDetailResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            if(!tokenService.isTokenValid(token)){
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