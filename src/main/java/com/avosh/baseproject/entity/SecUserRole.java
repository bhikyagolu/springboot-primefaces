/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "sec_user_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecUserRole.findAll", query = "SELECT s FROM SecUserRole s")})
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
        if (o == null || getClass() != o.getClass()) return false;
        SecUserRole that = (SecUserRole) o;
        return id == that.id && secUserId == that.secUserId && secRoleId == that.secRoleId && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(secRole, that.secRole) && Objects.equals(secUser, that.secUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secUserId, secRoleId, createDate, updateDate, secRole, secUser);
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
