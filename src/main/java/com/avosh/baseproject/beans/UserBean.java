package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public class UserBean extends BaseBean<UserService, UserDto> {
    List<UserDto> userDtoList;
    UserDto userDto;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @PostConstruct
    private void init(){
        service.retrieveAll();
    }

    public List<UserDto> getUserDtoList() {
        return userDtoList;
    }

    public void setUserDtoList(List<UserDto> userDtoList) {
        this.userDtoList = userDtoList;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
