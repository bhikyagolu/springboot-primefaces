/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
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
    private void init(){
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
