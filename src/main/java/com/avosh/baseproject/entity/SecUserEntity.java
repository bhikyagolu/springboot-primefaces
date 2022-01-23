package com.avosh.baseproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sec_user", schema = "base", catalog = "")
public class SecUserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "name", nullable = true, length = 45)
    private String name;
    @Basic
    @Column(name = "family", nullable = true, length = 45)
    private String family;
    @Basic
    @Column(name = "gender", nullable = true)
    private Byte gender;
    @Basic
    @Column(name = "cellphone", nullable = true, length = 45)
    private String cellphone;
    @Basic
    @Column(name = "phone", nullable = true, length = 45)
    private String phone;
    @Basic
    @Column(name = "email", nullable = true, length = 45)
    private String email;
    @Basic
    @Column(name = "address", nullable = true, length = 200)
    private String address;
    @Basic
    @Column(name = "password", nullable = true, length = 100)
    private String password;
    @Basic
    @Column(name = "nationalcode", nullable = true, length = 45)
    private String nationalcode;
    @Basic
    @Column(name = "is_login", nullable = true)
    private Boolean isLogin;
    @Basic
    @Column(name = "is_enable", nullable = true)
    private Boolean isEnable;
    @Basic
    @Column(name = "last_login", nullable = true)
    private Timestamp lastLogin;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "update_date", nullable = true)
    private Timestamp updateDate;
    @Basic
    @Column(name = "token", nullable = true, length = 200)
    private String token;

    public long getId() {
        return id;
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

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
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

    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecUserEntity that = (SecUserEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(family, that.family) && Objects.equals(gender, that.gender) && Objects.equals(cellphone, that.cellphone) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(password, that.password) && Objects.equals(nationalcode, that.nationalcode) && Objects.equals(isLogin, that.isLogin) && Objects.equals(isEnable, that.isEnable) && Objects.equals(lastLogin, that.lastLogin) && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, family, gender, cellphone, phone, email, address, password, nationalcode, isLogin, isEnable, lastLogin, createDate, updateDate, token);
    }
}
