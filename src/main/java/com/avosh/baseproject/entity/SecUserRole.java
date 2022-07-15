package com.avosh.baseproject.entity;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "sec_user_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecUserRole.findAll", query = "SELECT s FROM SecUserRole s")})
public class SecUserRole implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SecUserRolePK secUserRolePK;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecUser secUser;
    @JoinColumn(name = "sec_role_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecRole secRole;

    public SecUserRole() {
    }

    public SecUserRole(SecUserRolePK secUserRolePK) {
        this.secUserRolePK = secUserRolePK;
    }

    public SecUserRole(long id, long secUserId, long secRoleId) {
        this.secUserRolePK = new SecUserRolePK(id, secUserId, secRoleId);
    }

    public SecUserRolePK getSecUserRolePK() {
        return secUserRolePK;
    }

    public void setSecUserRolePK(SecUserRolePK secUserRolePK) {
        this.secUserRolePK = secUserRolePK;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    public SecRole getSecRole() {
        return secRole;
    }

    public void setSecRole(SecRole secRole) {
        this.secRole = secRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secUserRolePK != null ? secUserRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecUserRole)) {
            return false;
        }
        SecUserRole other = (SecUserRole) object;
        if ((this.secUserRolePK == null && other.secUserRolePK != null) || (this.secUserRolePK != null && !this.secUserRolePK.equals(other.secUserRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SecUserRole[ secUserRolePK=" + secUserRolePK + " ]";
    }
    
}
