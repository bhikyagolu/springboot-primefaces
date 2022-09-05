/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.List;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "question")
@XmlRootElement
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
    private Boolean hasVoice;
    @Column(name = "has_video")
    private Boolean hasVideo;
    @Column(name = "picture")
    private String picture;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @JoinColumn(name = "sub_lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SubLesson subLessonId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
    private List<Answer> answerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
    private List<SessionQuestion> sessionQuestionList;

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

    public Boolean getHasVoice() {
        return hasVoice;
    }

    public void setHasVoice(Boolean hasVoice) {
        this.hasVoice = hasVoice;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
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
    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    @XmlTransient
    public List<SessionQuestion> getSessionQuestionList() {
        return sessionQuestionList;
    }

    public void setSessionQuestionList(List<SessionQuestion> sessionQuestionList) {
        this.sessionQuestionList = sessionQuestionList;
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
