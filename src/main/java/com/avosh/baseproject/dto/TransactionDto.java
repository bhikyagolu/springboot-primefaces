/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class TransactionDto extends BaseDto {
    private String desc;
    private Long amount;
    private Long status;
    private Date createDateTime;
    private UserDto userDto;
    private RedeemDto redeemDto;

    public TransactionDto() {
    }

    public TransactionDto(Long id, String desc, Long amount, Date createDateTime, UserDto userDto, RedeemDto redeemDto) {
        this.id = id;
        this.desc = desc;
        this.amount = amount;
        this.createDateTime = createDateTime;
        this.userDto = userDto;
        this.redeemDto = redeemDto;
    }

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

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public RedeemDto getRedeemDto() {
        return redeemDto;
    }

    public void setRedeemDto(RedeemDto redeemDto) {
        this.redeemDto = redeemDto;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
