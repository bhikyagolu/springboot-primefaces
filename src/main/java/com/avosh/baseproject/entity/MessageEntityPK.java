package com.avosh.baseproject.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MessageEntityPK implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sec_user_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int secUserId;
    @Column(name = "message_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageId;
    @Column(name = "message_sec_user_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageSecUserId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        MessageEntityPK that = (MessageEntityPK) o;
        return id == that.id && secUserId == that.secUserId && messageId == that.messageId && messageSecUserId == that.messageSecUserId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secUserId, messageId, messageSecUserId);
    }
}
