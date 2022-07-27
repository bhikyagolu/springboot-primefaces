/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "finance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Finance.findAll", query = "SELECT f FROM Finance f")
    , @NamedQuery(name = "Finance.findById", query = "SELECT f FROM Finance f WHERE f.id = :id")
    , @NamedQuery(name = "Finance.findByDesc", query = "SELECT f FROM Finance f WHERE f.desc = :desc")
    , @NamedQuery(name = "Finance.findByAmount", query = "SELECT f FROM Finance f WHERE f.amount = :amount")})
public class Finance implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "desc")
    private String desc;
    @Column(name = "amount")
    private BigInteger amount;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
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

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
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
    
}
