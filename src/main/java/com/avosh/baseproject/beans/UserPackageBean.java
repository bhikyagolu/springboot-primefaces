/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.UserPackageDto;
import com.avosh.baseproject.services.UserPackageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class UserPackageBean extends BaseBean<UserPackageService, UserPackageDto> {
    private static final Logger log = Logger.getLogger(UserPackageBean.class);
    private boolean isEditMode;
    private List<UserPackageDto> list;
    private UserPackageDto userPackageDto;

    @Autowired
    public void setService(UserPackageService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        list = service.retrieveAll();
        userPackageDto = new UserPackageDto();
        setDto(new UserPackageDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<UserPackageDto> getList() {
        return list;
    }


    public UserPackageDto getDto() {
        return userPackageDto;
    }


    public void setDto(UserPackageDto dto) {
        this.userPackageDto = dto;
        super.setDto(userPackageDto);
    }

}
