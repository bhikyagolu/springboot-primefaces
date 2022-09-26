/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.RedeemUserDto;
import com.avosh.baseproject.services.RedeemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class RedeemUserBean extends BaseBean<RedeemUserService, RedeemUserDto> {
    private RedeemUserDto redeemUserDto;
    private List<RedeemUserDto> list;
    private boolean isEditMode;

    @Autowired
    public void setService(RedeemUserService service) {
        this.service = service;
    }

    @PostConstruct
    public void init(){
        list = service.retrieveAll();
        redeemUserDto = new RedeemUserDto();
        setDto(new RedeemUserDto());
    }

    @Override
    public void save() {
        super.save();
        init();
    }



    public void deleteRecord()  {
        super.delete();
        init();

    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public void setEditMode(boolean editMode) {
        isEditMode = editMode;
    }

    public RedeemUserDto getRedeemDto() {
        return redeemUserDto;
    }

    public void setRedeemDto(RedeemUserDto redeemDto) {
        this.redeemUserDto = redeemDto;
        setDto(redeemUserDto);
    }

    public List<RedeemUserDto> getDtoList() {
        return list;
    }
}
