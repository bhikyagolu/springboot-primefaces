package com.avosh.baseproject.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SecUserRoleEntityPK implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sec_role_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long secRoleId;
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

    public long getSecRoleId() {
        return secRoleId;
    }

    public void setSecRoleId(long secRoleId) {
        this.secRoleId = secRoleId;
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
        SecUserRoleEntityPK that = (SecUserRoleEntityPK) o;
        return id == that.id && secRoleId == that.secRoleId && secUserId == that.secUserId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secRoleId, secUserId);
    }
}
