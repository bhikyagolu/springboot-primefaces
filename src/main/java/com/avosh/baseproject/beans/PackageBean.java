/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.PackageDto;
import com.avosh.baseproject.services.PackageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class PackageBean extends BaseBean<PackageService, PackageDto> {
    private static final Logger log = Logger.getLogger(PackageBean.class);
    private boolean isEditMode;
    private List<PackageDto> list;
    private PackageDto packageDto;

    @Autowired
    public void setService(PackageService service) {
        this.service = service;
    }

    @PostConstruct
    private void init() {
        list = service.retrieveAll();
        packageDto = new PackageDto();
        setDto(new PackageDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<PackageDto> getList() {
        return list;
    }


    public PackageDto getDto() {
        return packageDto;
    }


    public void setDto(PackageDto dto) {
        this.packageDto = dto;
        super.setDto(packageDto);
    }

    public void deleteRecord() {
        super.delete();


    }
}
