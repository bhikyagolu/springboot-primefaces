/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "sec_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecRole.findAll", query = "SELECT s FROM SecRole s")
    , @NamedQuery(name = "SecRole.findById", query = "SELECT s FROM SecRole s WHERE s.id = :id")
    , @NamedQuery(name = "SecRole.findByRole", query = "SELECT s FROM SecRole s WHERE s.role = :role")
    , @NamedQuery(name = "SecRole.findByTitle", query = "SELECT s FROM SecRole s WHERE s.title = :title")
    , @NamedQuery(name = "SecRole.findByCreateDate", query = "SELECT s FROM SecRole s WHERE s.createDate = :createDate")})
public class SecRole implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "role")
    private String role;
    @Column(name = "title")
    private String title;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secRoleId")
    private Collection<SecUserRole> secUserRoleCollection;

    public SecRole() {
    }

    public SecRole(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @XmlTransient
    public Collection<SecUserRole> getSecUserRoleCollection() {
        return secUserRoleCollection;
    }

    public void setSecUserRoleCollection(Collection<SecUserRole> secUserRoleCollection) {
        this.secUserRoleCollection = secUserRoleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecRole)) {
            return false;
        }
        SecRole other = (SecRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SecRole[ id=" + id + " ]";
    }
    
}
