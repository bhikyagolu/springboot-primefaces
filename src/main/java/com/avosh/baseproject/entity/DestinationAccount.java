package com.avosh.baseproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@Entity
@Table(name = "av_destination_account")
@XmlRootElement
public class DestinationAccount implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "bank_id")
    private String BankId;
    @Basic(optional = true)
    @Column(name = "iban")
    private String Iban;
    @Basic(optional = true)
    @Column(name = "account")
    private String Account;
    @Basic(optional = true)
    @Column(name = "card_number")
    private String CardNumber;
    @Basic(optional = true)
    @Column(name = "name")
    private String Name;
    @Basic(optional = true)
    @Column(name = "cellphone")
    private String Cellphone;
    @JoinColumn(name = "sec_user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SecUser secUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankId() {
        return BankId;
    }

    public void setBankId(String bankId) {
        BankId = bankId;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        this.Account = account;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String cellphone) {
        Cellphone = cellphone;
    }

    public SecUser getSecUserId() {
        return secUserId;
    }

    public void setSecUserId(SecUser secUserId) {
        this.secUserId = secUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DestinationAccount)) return false;
        DestinationAccount that = (DestinationAccount) o;
        return getId().equals(that.getId()) && getBankId().equals(that.getBankId()) && getIban().equals(that.getIban()) && getAccount().equals(that.getAccount()) && getCardNumber().equals(that.getCardNumber()) && getName().equals(that.getName()) && getCellphone().equals(that.getCellphone()) && getSecUserId().equals(that.getSecUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBankId(), getIban(), getAccount(), getCardNumber(), getName(), getCellphone(), getSecUserId());
    }

    @Override
    public String toString() {
        return "DestinationAccount{" +
                "id=" + id +
                ", BankId='" + BankId + '\'' +
                ", Iban='" + Iban + '\'' +
                ", account='" + Account + '\'' +
                ", CardNumber='" + CardNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", Cellphone='" + Cellphone + '\'' +
                ", secUserId=" + secUserId +
                '}';
    }
}
