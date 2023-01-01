package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "linkpay")
@XmlRootElement
public class LinkPay implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "link")
    private String link;
    @Basic(optional = false)
    @Column(name = "amount")
    private Long amount;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;


}
