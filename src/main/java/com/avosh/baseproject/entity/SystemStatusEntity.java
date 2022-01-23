package com.avosh.baseproject.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "system_status", schema = "base", catalog = "")
@IdClass(SystemStatusEntityPK.class)
public class SystemStatusEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "title", nullable = true, length = 100)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = 500)
    private String description;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sec_user_id", nullable = false)
    private long secUserId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
        SystemStatusEntity that = (SystemStatusEntity) o;
        return id == that.id && secUserId == that.secUserId && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, status, secUserId);
    }
}
