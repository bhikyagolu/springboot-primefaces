package com.avosh.baseproject.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author amirk
 */
@Embeddable
public class SecUserRolePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;
    @Basic(optional = false)
    @Column(name = "sec_role_id")
    private long secRoleId;

    public SecUserRolePK() {
    }

    public SecUserRolePK(long id, long secUserId, long secRoleId) {
        this.id = id;
        this.secUserId = secUserId;
        this.secRoleId = secRoleId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) secUserId;
        hash += (int) secRoleId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecUserRolePK)) {
            return false;
        }
        SecUserRolePK other = (SecUserRolePK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.secUserId != other.secUserId) {
            return false;
        }
        if (this.secRoleId != other.secRoleId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SecUserRolePK[ id=" + id + ", secUserId=" + secUserId + ", secRoleId=" + secRoleId + " ]";
    }
    
}
