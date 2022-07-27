/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

public class FinanceDto extends BaseDto{
    private String desc;
    private Long amount;
    private UserDto secUserId;
    private RedeemDto redeemUserId;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public UserDto getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(UserDto secUserId) {
        this.secUserId = secUserId;
    }

    public RedeemDto getRedeemUserId() {
        return redeemUserId;
    }

    public void setRedeemUserId(RedeemDto redeemUserId) {
        this.redeemUserId = redeemUserId;
    }
}
