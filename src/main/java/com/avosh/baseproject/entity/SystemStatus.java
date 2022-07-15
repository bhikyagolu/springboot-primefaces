package com.avosh.baseproject.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "system_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemStatus.findAll", query = "SELECT s FROM SystemStatus s")})
public class SystemStatus implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SystemStatusPK systemStatusPK;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Short status;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser;

    public SystemStatus() {
    }

    public SystemStatus(SystemStatusPK systemStatusPK) {
        this.systemStatusPK = systemStatusPK;
    }

    public SystemStatus(long id, long secUserId) {
        this.systemStatusPK = new SystemStatusPK(id, secUserId);
    }

    public SystemStatusPK getSystemStatusPK() {
        return systemStatusPK;
    }

    public void setSystemStatusPK(SystemStatusPK systemStatusPK) {
        this.systemStatusPK = systemStatusPK;
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (systemStatusPK != null ? systemStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemStatus)) {
            return false;
        }
        SystemStatus other = (SystemStatus) object;
        if ((this.systemStatusPK == null && other.systemStatusPK != null) || (this.systemStatusPK != null && !this.systemStatusPK.equals(other.systemStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SystemStatus[ systemStatusPK=" + systemStatusPK + " ]";
    }
    
}
