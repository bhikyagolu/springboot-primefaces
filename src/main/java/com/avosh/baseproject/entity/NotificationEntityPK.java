package com.avosh.baseproject.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class NotificationEntityPK implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sec_user_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long secUserId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationEntityPK that = (NotificationEntityPK) o;
        return id == that.id && secUserId == that.secUserId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secUserId);
    }
}
