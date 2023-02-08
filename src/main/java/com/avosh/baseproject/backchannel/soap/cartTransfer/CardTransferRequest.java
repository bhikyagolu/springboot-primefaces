/**
 * CardTransferRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.cartTransfer;

import com.avosh.baseproject.backchannel.model.Message;

public class CardTransferRequest extends Message {
    private com.avosh.baseproject.backchannel.soap.cartTransfer.Credential credential;

    private java.lang.String sourceCardNumber;

    private java.lang.String destinationCardNumber;

    private java.lang.String pin2;

    private java.lang.String cvv2;

    private java.lang.String expireYear;

    private java.lang.String expireMonth;

    private org.apache.axis.types.NonNegativeInteger amount;

    private java.lang.String description;

    public CardTransferRequest() {
    }

    public CardTransferRequest(
           com.avosh.baseproject.backchannel.soap.cartTransfer.Credential credential,
           java.lang.String sourceCardNumber,
           java.lang.String destinationCardNumber,
           java.lang.String pin2,
           java.lang.String cvv2,
           java.lang.String expireYear,
           java.lang.String expireMonth,
           org.apache.axis.types.NonNegativeInteger amount,
           java.lang.String description) {
           this.credential = credential;
           this.sourceCardNumber = sourceCardNumber;
           this.destinationCardNumber = destinationCardNumber;
           this.pin2 = pin2;
           this.cvv2 = cvv2;
           this.expireYear = expireYear;
           this.expireMonth = expireMonth;
           this.amount = amount;
           this.description = description;
    }


    /**
     * Gets the credential value for this CardTransferRequest.
     * 
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.cartTransfer.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this CardTransferRequest.
     * 
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.cartTransfer.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the sourceCardNumber value for this CardTransferRequest.
     * 
     * @return sourceCardNumber
     */
    public java.lang.String getSourceCardNumber() {
        return sourceCardNumber;
    }


    /**
     * Sets the sourceCardNumber value for this CardTransferRequest.
     * 
     * @param sourceCardNumber
     */
    public void setSourceCardNumber(java.lang.String sourceCardNumber) {
        this.sourceCardNumber = sourceCardNumber;
    }


    /**
     * Gets the destinationCardNumber value for this CardTransferRequest.
     * 
     * @return destinationCardNumber
     */
    public java.lang.String getDestinationCardNumber() {
        return destinationCardNumber;
    }


    /**
     * Sets the destinationCardNumber value for this CardTransferRequest.
     * 
     * @param destinationCardNumber
     */
    public void setDestinationCardNumber(java.lang.String destinationCardNumber) {
        this.destinationCardNumber = destinationCardNumber;
    }


    /**
     * Gets the pin2 value for this CardTransferRequest.
     * 
     * @return pin2
     */
    public java.lang.String getPin2() {
        return pin2;
    }


    /**
     * Sets the pin2 value for this CardTransferRequest.
     * 
     * @param pin2
     */
    public void setPin2(java.lang.String pin2) {
        this.pin2 = pin2;
    }


    /**
     * Gets the cvv2 value for this CardTransferRequest.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this CardTransferRequest.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expireYear value for this CardTransferRequest.
     * 
     * @return expireYear
     */
    public java.lang.String getExpireYear() {
        return expireYear;
    }


    /**
     * Sets the expireYear value for this CardTransferRequest.
     * 
     * @param expireYear
     */
    public void setExpireYear(java.lang.String expireYear) {
        this.expireYear = expireYear;
    }


    /**
     * Gets the expireMonth value for this CardTransferRequest.
     * 
     * @return expireMonth
     */
    public java.lang.String getExpireMonth() {
        return expireMonth;
    }


    /**
     * Sets the expireMonth value for this CardTransferRequest.
     * 
     * @param expireMonth
     */
    public void setExpireMonth(java.lang.String expireMonth) {
        this.expireMonth = expireMonth;
    }


    /**
     * Gets the amount value for this CardTransferRequest.
     * 
     * @return amount
     */
    public org.apache.axis.types.NonNegativeInteger getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CardTransferRequest.
     * 
     * @param amount
     */
    public void setAmount(org.apache.axis.types.NonNegativeInteger amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this CardTransferRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CardTransferRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardTransferRequest)) return false;
        CardTransferRequest other = (CardTransferRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credential==null && other.getCredential()==null) || 
             (this.credential!=null &&
              this.credential.equals(other.getCredential()))) &&
            ((this.sourceCardNumber==null && other.getSourceCardNumber()==null) || 
             (this.sourceCardNumber!=null &&
              this.sourceCardNumber.equals(other.getSourceCardNumber()))) &&
            ((this.destinationCardNumber==null && other.getDestinationCardNumber()==null) || 
             (this.destinationCardNumber!=null &&
              this.destinationCardNumber.equals(other.getDestinationCardNumber()))) &&
            ((this.pin2==null && other.getPin2()==null) || 
             (this.pin2!=null &&
              this.pin2.equals(other.getPin2()))) &&
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.expireYear==null && other.getExpireYear()==null) || 
             (this.expireYear!=null &&
              this.expireYear.equals(other.getExpireYear()))) &&
            ((this.expireMonth==null && other.getExpireMonth()==null) || 
             (this.expireMonth!=null &&
              this.expireMonth.equals(other.getExpireMonth()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCredential() != null) {
            _hashCode += getCredential().hashCode();
        }
        if (getSourceCardNumber() != null) {
            _hashCode += getSourceCardNumber().hashCode();
        }
        if (getDestinationCardNumber() != null) {
            _hashCode += getDestinationCardNumber().hashCode();
        }
        if (getPin2() != null) {
            _hashCode += getPin2().hashCode();
        }
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getExpireYear() != null) {
            _hashCode += getExpireYear().hashCode();
        }
        if (getExpireMonth() != null) {
            _hashCode += getExpireMonth().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardTransferRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">CardTransferRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pin2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void setMessage(String message) {

    }
}
