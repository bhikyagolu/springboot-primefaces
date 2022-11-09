/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class RedeemUserDto extends BaseDto {

    private Date createDate;
    private RedeemDto redeem;
    private UserDto user;

    public RedeemUserDto() {
    }

    public RedeemUserDto(Long id, Date createDate, RedeemDto redeem, UserDto user) {
        this.id = id;
        this.createDate = createDate;
        this.redeem = redeem;
        this.user = user;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public RedeemDto getRedeem() {
        return redeem;
    }

    public void setRedeem(RedeemDto redeem) {
        this.redeem = redeem;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
