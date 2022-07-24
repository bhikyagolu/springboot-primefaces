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
@Table(name = "post")
@XmlRootElement
public class Post implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "sec_user_id")
    private long secUserId;
    @Column(name = "title")
    private String title;
    @Column(name = "brief")
    private String brief;
    @Column(name = "post")
    private String post;
    @Column(name = "photo")
    private String photo;
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser;

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
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
        if (!(o instanceof Post)) return false;
        Post post1 = (Post) o;
        return getId() == post1.getId() && getSecUserId() == post1.getSecUserId() && Objects.equals(getTitle(), post1.getTitle()) && Objects.equals(getBrief(), post1.getBrief()) && Objects.equals(getPost(), post1.getPost()) && Objects.equals(getPhoto(), post1.getPhoto()) && Objects.equals(getCreateDatetime(), post1.getCreateDatetime()) && Objects.equals(getSecUser(), post1.getSecUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSecUserId(), getTitle(), getBrief(), getPost(), getPhoto(), getCreateDatetime(), getSecUser());
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", secUserId=" + secUserId +
                ", title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                ", post='" + post + '\'' +
                ", photo='" + photo + '\'' +
                ", createDatetime=" + createDatetime +
                ", secUser=" + secUser +
                '}';
    }
}
