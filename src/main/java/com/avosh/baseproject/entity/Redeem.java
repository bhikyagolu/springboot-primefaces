/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "redeem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Redeem.findAll", query = "SELECT r FROM Redeem r")
    , @NamedQuery(name = "Redeem.findById", query = "SELECT r FROM Redeem r WHERE r.id = :id")
    , @NamedQuery(name = "Redeem.findByTitle", query = "SELECT r FROM Redeem r WHERE r.title = :title")
    , @NamedQuery(name = "Redeem.findByDesc", query = "SELECT r FROM Redeem r WHERE r.desc = :desc")
    , @NamedQuery(name = "Redeem.findByCode", query = "SELECT r FROM Redeem r WHERE r.code = :code")
    , @NamedQuery(name = "Redeem.findByExpireDate", query = "SELECT r FROM Redeem r WHERE r.expireDate = :expireDate")
    , @NamedQuery(name = "Redeem.findByStartDate", query = "SELECT r FROM Redeem r WHERE r.startDate = :startDate")
    , @NamedQuery(name = "Redeem.findByMultiple", query = "SELECT r FROM Redeem r WHERE r.multiple = :multiple")
    , @NamedQuery(name = "Redeem.findByCount", query = "SELECT r FROM Redeem r WHERE r.count = :count")
    , @NamedQuery(name = "Redeem.findByCreateDate", query = "SELECT r FROM Redeem r WHERE r.createDate = :createDate")})
public class Redeem implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "desc")
    private String desc;
    @Column(name = "code")
    private String code;
    @Column(name = "expire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "multiple")
    private Short multiple;
    @Column(name = "count")
    private Integer count;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "redeemId")
    private Collection<RedeemUser> redeemUserCollection;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SecUser secUserId;

    public Redeem() {
    }

    public Redeem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Short getMultiple() {
        return multiple;
    }

    public void setMultiple(Short multiple) {
        this.multiple = multiple;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @XmlTransient
    public Collection<RedeemUser> getRedeemUserCollection() {
        return redeemUserCollection;
    }

    public void setRedeemUserCollection(Collection<RedeemUser> redeemUserCollection) {
        this.redeemUserCollection = redeemUserCollection;
    }

    public SecUser getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(SecUser secUserId) {
        this.secUserId = secUserId;
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
        if (!(object instanceof Redeem)) {
            return false;
        }
        Redeem other = (Redeem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Redeem[ id=" + id + " ]";
    }
    
}
