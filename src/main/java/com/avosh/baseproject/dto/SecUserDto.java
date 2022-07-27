/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.avosh.baseproject.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SecUserDto implements Serializable {
    private final long id;
    private final String name;
    private final String family;
    private final Boolean gender;
    private final String cellphone;
    private final String phone;
    private final String email;
    private final String address;
    private final String password;
    private final String nationalcode;
    private final Boolean isLogin;
    private final Boolean isEnable;
    private final Date lastLogin;
    private final Date createDate;
    private final Date updateDate;
    private final String token;

    public SecUserDto(long id, String name, String family, Boolean gender, String cellphone, String phone, String email, String address, String password, String nationalcode, Boolean isLogin, Boolean isEnable, Date lastLogin, Date createDate, Date updateDate, String token) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Boolean getGender() {
        return gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getToken() {
        return token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecUserDto entity = (SecUserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.family, entity.family) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.cellphone, entity.cellphone) &&
                Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.nationalcode, entity.nationalcode) &&
                Objects.equals(this.isLogin, entity.isLogin) &&
                Objects.equals(this.isEnable, entity.isEnable) &&
                Objects.equals(this.lastLogin, entity.lastLogin) &&
                Objects.equals(this.createDate, entity.createDate) &&
                Objects.equals(this.updateDate, entity.updateDate) &&
                Objects.equals(this.token, entity.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, family, gender, cellphone, phone, email, address, password, nationalcode, isLogin, isEnable, lastLogin, createDate, updateDate, token);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "family = " + family + ", " +
                "gender = " + gender + ", " +
                "cellphone = " + cellphone + ", " +
                "phone = " + phone + ", " +
                "email = " + email + ", " +
                "address = " + address + ", " +
                "password = " + password + ", " +
                "nationalcode = " + nationalcode + ", " +
                "isLogin = " + isLogin + ", " +
                "isEnable = " + isEnable + ", " +
                "lastLogin = " + lastLogin + ", " +
                "createDate = " + createDate + ", " +
                "updateDate = " + updateDate + ", " +
                "token = " + token + ")";
    }
}
