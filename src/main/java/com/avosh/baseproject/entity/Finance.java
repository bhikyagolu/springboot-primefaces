/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @author amirk
 */
@Entity
@Table(name = "finance")
@XmlRootElement
public class Finance implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    @JoinColumn(name = "bank_id", referencedColumnName = "id")
    @ManyToOne
    private Bank bankId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "desc")
    private String desc;
    @Column(name = "amount")
    private Long amount;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SecUser secUserId;
    @JoinColumn(name = "redeem_user_id", referencedColumnName = "id")
    @ManyToOne
    private RedeemUser redeemUserId;

    public Finance() {
    }

    public Finance(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public SecUser getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(SecUser secUserId) {
        this.secUserId = secUserId;
    }

    public RedeemUser getRedeemUserId() {
        return redeemUserId;
    }

    public void setRedeemUserId(RedeemUser redeemUserId) {
        this.redeemUserId = redeemUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Finance)) {
            return false;
        }
        Finance other = (Finance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Finance[ id=" + id + " ]";
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Bank getBankId() {
        return bankId;
    }

    public void setBankId(Bank bankId) {
        this.bankId = bankId;
    }

}
