/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "sub_lesson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubLesson.findAll", query = "SELECT s FROM SubLesson s")
    , @NamedQuery(name = "SubLesson.findById", query = "SELECT s FROM SubLesson s WHERE s.id = :id")
    , @NamedQuery(name = "SubLesson.findByTitle", query = "SELECT s FROM SubLesson s WHERE s.title = :title")
    , @NamedQuery(name = "SubLesson.findByDesc", query = "SELECT s FROM SubLesson s WHERE s.desc = :desc")
    , @NamedQuery(name = "SubLesson.findByLevel", query = "SELECT s FROM SubLesson s WHERE s.level = :level")
    , @NamedQuery(name = "SubLesson.findByCreateDateTime", query = "SELECT s FROM SubLesson s WHERE s.createDateTime = :createDateTime")})
public class SubLesson implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "desc")
    private String desc;
    @Column(name = "level")
    private Integer level;
    @Column(name = "create_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subLessonId")
    private Collection<Package> packageCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subLessonId")
    private Collection<Question> questionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subLessonId")
    private Collection<Session> sessionCollection;
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Lesson lessonId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subLessonId")
    private Collection<SubLesson> subLessonCollection;
    @JoinColumn(name = "sub_lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SubLesson subLessonId;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SecUser secUserId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subLessonId")
    private Collection<Library> libraryCollection;

    public SubLesson() {
    }

    public SubLesson(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    @XmlTransient
    public Collection<Package> getPackageCollection() {
        return packageCollection;
    }

    public void setPackageCollection(Collection<Package> packageCollection) {
        this.packageCollection = packageCollection;
    }

    @XmlTransient
    public Collection<Question> getQuestionCollection() {
        return questionCollection;
    }

    public void setQuestionCollection(Collection<Question> questionCollection) {
        this.questionCollection = questionCollection;
    }

    @XmlTransient
    public Collection<Session> getSessionCollection() {
        return sessionCollection;
    }

    public void setSessionCollection(Collection<Session> sessionCollection) {
        this.sessionCollection = sessionCollection;
    }

    public Lesson getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lesson lessonId) {
        this.lessonId = lessonId;
    }

    @XmlTransient
    public Collection<SubLesson> getSubLessonCollection() {
        return subLessonCollection;
    }

    public void setSubLessonCollection(Collection<SubLesson> subLessonCollection) {
        this.subLessonCollection = subLessonCollection;
    }

    public SubLesson getSubLessonId() {
        return subLessonId;
    }

    public void setSubLessonId(SubLesson subLessonId) {
        this.subLessonId = subLessonId;
    }

    public SecUser getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(SecUser secUserId) {
        this.secUserId = secUserId;
    }

    @XmlTransient
    public Collection<Library> getLibraryCollection() {
        return libraryCollection;
    }

    public void setLibraryCollection(Collection<Library> libraryCollection) {
        this.libraryCollection = libraryCollection;
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
        if (!(object instanceof SubLesson)) {
            return false;
        }
        SubLesson other = (SubLesson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SubLesson[ id=" + id + " ]";
    }
    
}
