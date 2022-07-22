/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class MessagePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;
    @Basic(optional = false)
    @Column(name = "sec_user_id1")
    private long secUserId1;

    public MessagePK() {
    }

    public MessagePK(long id, long secUserId, long secUserId1) {
        this.id = id;
        this.secUserId = secUserId;
        this.secUserId1 = secUserId1;
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

    public long getSecUserId1() {
        return secUserId1;
    }

    public void setSecUserId1(long secUserId1) {
        this.secUserId1 = secUserId1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) secUserId;
        hash += (int) secUserId1;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessagePK)) {
            return false;
        }
        MessagePK other = (MessagePK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.secUserId != other.secUserId) {
            return false;
        }
        if (this.secUserId1 != other.secUserId1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.MessagePK[ id=" + id + ", secUserId=" + secUserId + ", secUserId1=" + secUserId1 + " ]";
    }
    
}
