/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * @author amirk
 */
@Entity
@Table(name = "package")
@XmlRootElement
public class Package implements BaseEntity {

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
    @Column(name = "fee")
    private BigInteger fee;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "end_discount")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDiscount;
    @Column(name = "picture")
    private String picture;
    @JoinColumn(name = "sub_lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SubLesson subLessonId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packageId")
    private List<UserPackage> userPackageList;

    public Package() {
    }

    public Package(Long id) {
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

    public BigInteger getFee() {
        return fee;
    }

    public void setFee(BigInteger fee) {
        this.fee = fee;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Date getEndDiscount() {
        return endDiscount;
    }

    public void setEndDiscount(Date endDiscount) {
        this.endDiscount = endDiscount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public SubLesson getSubLessonId() {
        return subLessonId;
    }

    public void setSubLessonId(SubLesson subLessonId) {
        this.subLessonId = subLessonId;
    }

    @XmlTransient
    public List<UserPackage> getUserPackageList() {
        return userPackageList;
    }

    public void setUserPackageList(List<UserPackage> userPackageList) {
        this.userPackageList = userPackageList;
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
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Package[ id=" + id + " ]";
    }

}
