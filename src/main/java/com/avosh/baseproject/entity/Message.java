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
@Table(name = "message")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")})
public class Message implements BaseEntity {

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
    @Column(name = "sec_user_id1")
    private long secUserId1;
    @Column(name = "title")
    private String title;
    @Column(name = "message")
    private String message;
    @Column(name = "is_read")
    private Short isRead;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser;
    @JoinColumn(name = "sec_user_id1", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser1;

    public Message() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Short getIsRead() {
        return isRead;
    }

    public void setIsRead(Short isRead) {
        this.isRead = isRead;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    public SecUser getSecUser1() {
        return secUser1;
    }

    public void setSecUser1(SecUser secUser1) {
        this.secUser1 = secUser1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return id == message1.id && secUserId == message1.secUserId && secUserId1 == message1.secUserId1 && Objects.equals(title, message1.title) && Objects.equals(message, message1.message) && Objects.equals(isRead, message1.isRead) && Objects.equals(createDate, message1.createDate) && Objects.equals(secUser, message1.secUser) && Objects.equals(secUser1, message1.secUser1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secUserId, secUserId1, title, message, isRead, createDate, secUser, secUser1);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", secUserId=" + secUserId +
                ", secUserId1=" + secUserId1 +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", isRead=" + isRead +
                ", createDate=" + createDate +
                ", secUser=" + secUser +
                ", secUser1=" + secUser1 +
                '}';
    }
}
