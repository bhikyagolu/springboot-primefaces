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
public class NotificationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;

    public NotificationPK() {
    }

    public NotificationPK(long id, long secUserId) {
        this.id = id;
        this.secUserId = secUserId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) secUserId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificationPK)) {
            return false;
        }
        NotificationPK other = (NotificationPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.secUserId != other.secUserId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.NotificationPK[ id=" + id + ", secUserId=" + secUserId + " ]";
    }
    
}
