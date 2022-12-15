
package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "sec_user")
@XmlRootElement
public class SecUser implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "family")
    private String family;
    @Column(name = "gender")
    private Boolean gender;
    @Column(name = "cellphone")
    private String cellphone;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "password")
    private String password;
    @Column(name = "nationalcode")
    private String nationalcode;
    @Column(name = "about")
    private String about;
    @Column(name = "is_login")
    private Boolean isLogin;
    @Column(name = "is_enable")
    private Boolean isEnable;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "token")
    private String token;
    @Column(name = "user_type")
    private Integer userType;
    @Column(name = "iban")
    private String iban;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<News> newsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<Notification> notificationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<System> systemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<Post> postList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<RedeemUser> redeemUserList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<Redeem> redeemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<Message> messageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId1")
    private List<Message> messageList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<SecUserRole> secUserRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<Transaction> transactionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<Device> deviceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<SourceAccount> sourceAccounts;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<DestinationAccount> destinationAccounts;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secUserId")
    private List<SpecialAccounts> specialAccounts;


    public SecUser() {
    }

    public SecUser(Long id) {
        this.id = id;
    }

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @XmlTransient
    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @XmlTransient
    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    @XmlTransient
    public List<System> getSystemList() {
        return systemList;
    }

    public void setSystemList(List<System> systemList) {
        this.systemList = systemList;
    }

    @XmlTransient
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @XmlTransient
    public List<RedeemUser> getRedeemUserList() {
        return redeemUserList;
    }

    public void setRedeemUserList(List<RedeemUser> redeemUserList) {
        this.redeemUserList = redeemUserList;
    }

    @XmlTransient
    public List<Redeem> getRedeemList() {
        return redeemList;
    }

    public void setRedeemList(List<Redeem> redeemList) {
        this.redeemList = redeemList;
    }

    @XmlTransient
    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    @XmlTransient
    public List<Message> getMessageList1() {
        return messageList1;
    }

    public void setMessageList1(List<Message> messageList1) {
        this.messageList1 = messageList1;
    }

    @XmlTransient
    public List<SecUserRole> getSecUserRoleList() {
        return secUserRoleList;
    }

    public void setSecUserRoleList(List<SecUserRole> secUserRoleList) {
        this.secUserRoleList = secUserRoleList;
    }

    @XmlTransient
    public List<Transaction> getFinanceList() {
        return transactionList;
    }

    public void setFinanceList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
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
        if (!(object instanceof SecUser)) {
            return false;
        }
        SecUser other = (SecUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SecUser[ id=" + id + " ]";
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @XmlTransient
    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }
    @XmlTransient
    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }
    @XmlTransient
    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }
    @XmlTransient
    public List<SourceAccount> getSourceAccounts() {
        return sourceAccounts;
    }

    public void setSourceAccounts(List<SourceAccount> sourceAccountList) {
        this.sourceAccounts = sourceAccountList;
    }
    @XmlTransient
    public List<DestinationAccount> getDestinationAccounts() {
        return destinationAccounts;
    }

    public void setDestinationAccounts(List<DestinationAccount> destinationAccounts) {
        this.destinationAccounts = destinationAccounts;
    }
    @XmlTransient
    public List<SpecialAccounts> getSpecialAccounts() {
        return specialAccounts;
    }

    public void setSpecialAccounts(List<SpecialAccounts> specialAccounts) {
        this.specialAccounts = specialAccounts;
    }
}
