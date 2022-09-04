/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.services.RedeemService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("session")
public class RedeemBean  extends BaseBean<RedeemService, RedeemDto> {
    private RedeemDto redeemDto;
    private List<RedeemDto> dtoList;
    private boolean isEditMode;

    @Override
    public void save() {

    }



      public void deleteRecord() {

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

    public List<RedeemDto> getDtoList() {
        return dtoList;
    }
}
