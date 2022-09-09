/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.SystemDto;
import com.avosh.baseproject.services.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class SystemBean extends BaseBean<SystemService, SystemDto> {
    private boolean isEditMode;
    private List<SystemDto> list;
    private SystemDto systemDto;


    @Autowired
    public void setService(SystemService service) {
        this.service = service;
    }

    @PostConstruct
    private void init(){
        list = service.retrieveAll();
        systemDto = new SystemDto();
        setDto(new SystemDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<SystemDto> getList() {
        return list;
    }


    public SystemDto getDto() {
        return systemDto;
    }


    public void setDto(SystemDto dto) {
        this.systemDto = dto;

    }

    public void deleteRecord()  {
        super.delete();
        init();

    }
}
