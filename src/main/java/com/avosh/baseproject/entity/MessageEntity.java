package com.avosh.baseproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "message", schema = "base", catalog = "")
@IdClass(MessageEntityPK.class)
public class MessageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "title", nullable = true, length = 100)
    private String title;
    @Basic
    @Column(name = "message", nullable = true, length = 500)
    private String message;
    @Basic
    @Column(name = "is_read", nullable = true)
    private Boolean isRead;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sec_user_id", nullable = false)
    private int secUserId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "message_id", nullable = false)
    private long messageId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "message_sec_user_id", nullable = false)
    private long messageSecUserId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public int getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(int secUserId) {
        this.secUserId = secUserId;
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public long getMessageSecUserId() {
        return messageSecUserId;
    }

    public void setMessageSecUserId(long messageSecUserId) {
        this.messageSecUserId = messageSecUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return id == that.id && secUserId == that.secUserId && messageId == that.messageId && messageSecUserId == that.messageSecUserId && Objects.equals(title, that.title) && Objects.equals(message, that.message) && Objects.equals(isRead, that.isRead) && Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, message, isRead, createDate, secUserId, messageId, messageSecUserId);
    }
}
