/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.services.UserProfileService;
import com.avosh.baseproject.ws.model.ProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class ProfileWs extends BaseWs {
    @Autowired
    private UserProfileService profileService;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/profile")
    public ResponseEntity getUserProfile(@RequestHeader("token") String token) {
        HttpStatus httpStatus = HttpStatus.OK;
        ProfileResponse response = new ProfileResponse();
        try {
            if (!tokenService.isTokenValid(token)) {
                throw new TokenIsNotValidException();
            }
            UserDto res = profileService.retrieveUserProfileByToken(token);
            response = prepareResponse(res);
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

    private ProfileResponse prepareResponse(UserDto res) {
        ProfileResponse response = new ProfileResponse();
        response.setAbout(res.getAbout());
        response.setAddress(res.getAddress());
        response.setFamily(res.getFamily());
        response.setCellphone(res.getCellphone());
        response.setName(res.getName());
        response.setNationalcode(res.getNationalcode());
        response.setEmail(res.getEmail());
        response.setGender(res.getGender());
        response.setPhone(res.getPhone());
        response.setIban(res.getIban());
        response.setAbout(res.getAbout());
        response.setCreateDate(res.getCreateDate());
        response.setLastLogin(res.getLastLogin());
        return response;
    }
}