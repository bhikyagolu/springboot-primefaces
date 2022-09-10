/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "sec_user_role")
@XmlRootElement
public class SecUserRole implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;
    @Basic(optional = false)
    @Column(name = "sec_role_id")
    private long secRoleId;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @JoinColumn(name = "sec_role_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecRole secRole;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser;

    public SecUserRole() {
    }

    public SecUserRole(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(long secUserId) {
        this.secUserId = secUserId;
    }

    public long getSecRoleId() {
        return secRoleId;
    }

    public void setSecRoleId(long secRoleId) {
        this.secRoleId = secRoleId;
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

    public SecRole getSecRole() {
        return secRole;
    }

    public void setSecRole(SecRole secRole) {
        this.secRole = secRole;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecUserRole)) return false;
        SecUserRole that = (SecUserRole) o;
        return getId() == that.getId() && getSecUserId() == that.getSecUserId() && getSecRoleId() == that.getSecRoleId() && Objects.equals(getCreateDate(), that.getCreateDate()) && Objects.equals(getUpdateDate(), that.getUpdateDate()) && Objects.equals(getSecRole(), that.getSecRole()) && Objects.equals(getSecUser(), that.getSecUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSecUserId(), getSecRoleId(), getCreateDate(), getUpdateDate(), getSecRole(), getSecUser());
    }

    @Override
    public String toString() {
        return "SecUserRole{" +
                "id=" + id +
                ", secUserId=" + secUserId +
                ", secRoleId=" + secRoleId +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", secRole=" + secRole +
                ", secUser=" + secUser +
                '}';
    }
}
