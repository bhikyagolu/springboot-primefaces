/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "news")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "News.findAll", query = "SELECT n FROM News n")})
public class News implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;
    @Column(name = "title")
    private String title;
    @Column(name = "brif")
    private String brif;
    @Column(name = "news")
    private String news;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = true)
    private SecUser secUser;


    public News() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(long secUserId) {
        this.secUserId = secUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrif() {
        return brif;
    }

    public void setBrif(String brif) {
        this.brif = brif;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
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

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News news1 = (News) o;
        return getSecUserId() == news1.getSecUserId() && Objects.equals(getId(), news1.getId()) && Objects.equals(getTitle(), news1.getTitle()) && Objects.equals(getBrif(), news1.getBrif()) && Objects.equals(getNews(), news1.getNews()) && Objects.equals(getCreateDate(), news1.getCreateDate()) && Objects.equals(getUpdateDate(), news1.getUpdateDate()) && Objects.equals(getSecUser(), news1.getSecUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSecUserId(), getTitle(), getBrif(), getNews(), getCreateDate(), getUpdateDate(), getSecUser());
    }

    @Override
    public String toString() {
        return "javaapplication1.News[ id=" + id + " ]";
    }
    
}
