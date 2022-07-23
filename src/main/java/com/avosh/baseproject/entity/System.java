/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity(name = "System")
@Table(name = "system")
public class System implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description", nullable = false, length = 250)
    private String description;

    @Column(name = "enable", nullable = false)
    private Boolean enable = false;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "min_version", nullable = false)
    private Boolean minVersion = false;

    @Column(name = "create_datetime", nullable = false)
    private Instant createDatetime;

    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = true)
    private SecUser secUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(Boolean minVersion) {
        this.minVersion = minVersion;
    }

    public Instant getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Instant createDatetime) {
        this.createDatetime = createDatetime;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }
}