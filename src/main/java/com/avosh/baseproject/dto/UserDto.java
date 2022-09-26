/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class UserDto extends BaseDto{

    private String name;
    private String family;
    private Boolean gender;
    private String cellphone;
    private String phone;
    private String email;
    private String address;
    private String password;
    private String nationalcode;
    private Boolean isLogin;
    private Boolean isEnable;
    private Date lastLogin;
    private Date createDate;
    private Date updateDate;
    private String token;
    private String iban;
    private String about;

    public UserDto() {
    }

    public UserDto(String name, String family, Boolean gender, String cellphone, String phone, String email, String address, String password, String nationalcode, Boolean isLogin, Boolean isEnable, Date lastLogin, Date createDate, Date updateDate, String token) {
        this.name = name;
        this.family = family;
        this.gender = gender;
        this.cellphone = cellphone;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.nationalcode = nationalcode;
        this.isLogin = isLogin;
        this.isEnable = isEnable;
        this.lastLogin = lastLogin;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.token = token;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
