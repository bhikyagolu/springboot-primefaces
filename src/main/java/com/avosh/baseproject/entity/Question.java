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
@Table(name = "question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Question.findAll", query = "SELECT q FROM Question q")
    , @NamedQuery(name = "Question.findById", query = "SELECT q FROM Question q WHERE q.id = :id")
    , @NamedQuery(name = "Question.findByQuestion", query = "SELECT q FROM Question q WHERE q.question = :question")
    , @NamedQuery(name = "Question.findByHasVoice", query = "SELECT q FROM Question q WHERE q.hasVoice = :hasVoice")
    , @NamedQuery(name = "Question.findByHasVideo", query = "SELECT q FROM Question q WHERE q.hasVideo = :hasVideo")
    , @NamedQuery(name = "Question.findByPicture", query = "SELECT q FROM Question q WHERE q.picture = :picture")
    , @NamedQuery(name = "Question.findByCreateDate", query = "SELECT q FROM Question q WHERE q.createDate = :createDate")})
public class Question implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "question")
    private String question;
    @Column(name = "has_voice")
    private Short hasVoice;
    @Column(name = "has_video")
    private Short hasVideo;
    @Column(name = "picture")
    private String picture;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @JoinColumn(name = "sub_lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SubLesson subLessonId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
    private Collection<Answer> answerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
    private Collection<SessionQuestion> sessionQuestionCollection;

    public Question() {
    }

    public Question(Long id) {
        this.id = id;
    }

    public Question(Long id, String question) {
        this.id = id;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Short getHasVoice() {
        return hasVoice;
    }

    public void setHasVoice(Short hasVoice) {
        this.hasVoice = hasVoice;
    }

    public Short getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Short hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public SubLesson getSubLessonId() {
        return subLessonId;
    }

    public void setSubLessonId(SubLesson subLessonId) {
        this.subLessonId = subLessonId;
    }

    @XmlTransient
    public Collection<Answer> getAnswerCollection() {
        return answerCollection;
    }

    public void setAnswerCollection(Collection<Answer> answerCollection) {
        this.answerCollection = answerCollection;
    }

    @XmlTransient
    public Collection<SessionQuestion> getSessionQuestionCollection() {
        return sessionQuestionCollection;
    }

    public void setSessionQuestionCollection(Collection<SessionQuestion> sessionQuestionCollection) {
        this.sessionQuestionCollection = sessionQuestionCollection;
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
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Question[ id=" + id + " ]";
    }
    
}
