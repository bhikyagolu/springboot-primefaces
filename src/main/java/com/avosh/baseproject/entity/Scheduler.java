package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "scheduler")
@XmlRootElement
public class Scheduler implements BaseEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scheduler)) return false;
        Scheduler scheduler = (Scheduler) o;
        return getId().equals(scheduler.getId()) && getName().equals(scheduler.getName()) && getStatus().equals(scheduler.getStatus()) && getUpdateTime().equals(scheduler.getUpdateTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStatus(), getUpdateTime());
    }
}
