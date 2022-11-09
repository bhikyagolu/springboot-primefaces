/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.services.RedeemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class RedeemBean extends BaseBean<RedeemService, RedeemDto> {
    private RedeemDto redeemDto;
    private List<RedeemDto> list;
    private boolean isEditMode;

    @Autowired
    public void setService(RedeemService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        list = service.retrieveAll();
        redeemDto = new RedeemDto();
        setDto(new RedeemDto());
    }

    @Override
    public void save() {
        super.save();
        init();
    }


    public void deleteRecord() {
        super.deleteById();
        init();

    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public void setEditMode(boolean editMode) {
        isEditMode = editMode;
    }

    public RedeemDto getRedeemDto() {
        return redeemDto;
    }

    public void setRedeemDto(RedeemDto redeemDto) {
        this.redeemDto = redeemDto;
        setDto(redeemDto);
    }

    public List<RedeemDto> getDtoList() {
        return list;
    }
}
