/*******************************************************************************
* Created by Alireza Amirkhani 2022
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
    private List<SystemDto> list;
    private SystemDto systemDto;


    @Autowired
    public void setService(SystemService service) {
        this.service = service;
    }

    @PostConstruct
    public void init(){
        list = service.retrieveAll();
        systemDto = new SystemDto();
        setDto(new SystemDto());
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

    public void doSave(){
        super.save();
        init();
    }
}
