/*******************************************************************************
 * Created by Alireza Amirkhani 2022
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
    public void init() {
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
        super.deleteById();


    }
}
