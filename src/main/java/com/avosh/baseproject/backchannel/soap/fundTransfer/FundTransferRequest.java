/**
 * FundTransferRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransfer;

import com.avosh.baseproject.backchannel.model.Message;

public class FundTransferRequest extends Message {
    private com.avosh.baseproject.backchannel.soap.fundTransfer.Credential credential;

    private java.lang.String sourceAccountNumber;

    private java.lang.String destinationAccountNumber;

    private org.apache.axis.types.NonNegativeInteger amount;

    private java.math.BigInteger paymentCode1;

    private java.math.BigInteger paymentCode2;

    private java.lang.String description;

    private java.lang.String tagCode;

    private java.util.Date dueDate;

    public FundTransferRequest() {
    }

    public FundTransferRequest(
            com.avosh.baseproject.backchannel.soap.fundTransfer.Credential credential,
            java.lang.String sourceAccountNumber,
            java.lang.String destinationAccountNumber,
            org.apache.axis.types.NonNegativeInteger amount,
            java.math.BigInteger paymentCode1,
            java.math.BigInteger paymentCode2,
            java.lang.String description,
            java.lang.String tagCode,
            java.util.Date dueDate) {
        this.credential = credential;
        this.sourceAccountNumber = sourceAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
        this.paymentCode1 = paymentCode1;
        this.paymentCode2 = paymentCode2;
        this.description = description;
        this.tagCode = tagCode;
        this.dueDate = dueDate;
    }


    /**
     * Gets the credential value for this FundTransferRequest.
     *
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.fundTransfer.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this FundTransferRequest.
     *
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.fundTransfer.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the sourceAccountNumber value for this FundTransferRequest.
     *
     * @return sourceAccountNumber
     */
    public java.lang.String getSourceAccountNumber() {
        return sourceAccountNumber;
    }


    /**
     * Sets the sourceAccountNumber value for this FundTransferRequest.
     *
     * @param sourceAccountNumber
     */
    public void setSourceAccountNumber(java.lang.String sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }


    /**
     * Gets the destinationAccountNumber value for this FundTransferRequest.
     *
     * @return destinationAccountNumber
     */
    public java.lang.String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }


    /**
     * Sets the destinationAccountNumber value for this FundTransferRequest.
     *
     * @param destinationAccountNumber
     */
    public void setDestinationAccountNumber(java.lang.String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }


    /**
     * Gets the amount value for this FundTransferRequest.
     *
     * @return amount
     */
    public org.apache.axis.types.NonNegativeInteger getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FundTransferRequest.
     *
     * @param amount
     */
    public void setAmount(org.apache.axis.types.NonNegativeInteger amount) {
        this.amount = amount;
    }


    /**
     * Gets the paymentCode1 value for this FundTransferRequest.
     *
     * @return paymentCode1
     */
    public java.math.BigInteger getPaymentCode1() {
        return paymentCode1;
    }


    /**
     * Sets the paymentCode1 value for this FundTransferRequest.
     *
     * @param paymentCode1
     */
    public void setPaymentCode1(java.math.BigInteger paymentCode1) {
        this.paymentCode1 = paymentCode1;
    }


    /**
     * Gets the paymentCode2 value for this FundTransferRequest.
     *
     * @return paymentCode2
     */
    public java.math.BigInteger getPaymentCode2() {
        return paymentCode2;
    }


    /**
     * Sets the paymentCode2 value for this FundTransferRequest.
     *
     * @param paymentCode2
     */
    public void setPaymentCode2(java.math.BigInteger paymentCode2) {
        this.paymentCode2 = paymentCode2;
    }


    /**
     * Gets the description value for this FundTransferRequest.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FundTransferRequest.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the tagCode value for this FundTransferRequest.
     *
     * @return tagCode
     */
    public java.lang.String getTagCode() {
        return tagCode;
    }


    /**
     * Sets the tagCode value for this FundTransferRequest.
     *
     * @param tagCode
     */
    public void setTagCode(java.lang.String tagCode) {
        this.tagCode = tagCode;
    }


    /**
     * Gets the dueDate value for this FundTransferRequest.
     *
     * @return dueDate
     */
    public java.util.Date getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this FundTransferRequest.
     *
     * @param dueDate
     */
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundTransferRequest)) return false;
        FundTransferRequest other = (FundTransferRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.credential == null && other.getCredential() == null) ||
                (this.credential != null &&
                        this.credential.equals(other.getCredential()))) &&
                ((this.sourceAccountNumber == null && other.getSourceAccountNumber() == null) ||
                        (this.sourceAccountNumber != null &&
                                this.sourceAccountNumber.equals(other.getSourceAccountNumber()))) &&
                ((this.destinationAccountNumber == null && other.getDestinationAccountNumber() == null) ||
                        (this.destinationAccountNumber != null &&
                                this.destinationAccountNumber.equals(other.getDestinationAccountNumber()))) &&
                ((this.amount == null && other.getAmount() == null) ||
                        (this.amount != null &&
                                this.amount.equals(other.getAmount()))) &&
                ((this.paymentCode1 == null && other.getPaymentCode1() == null) ||
                        (this.paymentCode1 != null &&
                                this.paymentCode1.equals(other.getPaymentCode1()))) &&
                ((this.paymentCode2 == null && other.getPaymentCode2() == null) ||
                        (this.paymentCode2 != null &&
                                this.paymentCode2.equals(other.getPaymentCode2()))) &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.tagCode == null && other.getTagCode() == null) ||
                        (this.tagCode != null &&
                                this.tagCode.equals(other.getTagCode()))) &&
                ((this.dueDate == null && other.getDueDate() == null) ||
                        (this.dueDate != null &&
                                this.dueDate.equals(other.getDueDate())));
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
        if (getSourceAccountNumber() != null) {
            _hashCode += getSourceAccountNumber().hashCode();
        }
        if (getDestinationAccountNumber() != null) {
            _hashCode += getDestinationAccountNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPaymentCode1() != null) {
            _hashCode += getPaymentCode1().hashCode();
        }
        if (getPaymentCode2() != null) {
            _hashCode += getPaymentCode2().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTagCode() != null) {
            _hashCode += getTagCode().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FundTransferRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">FundTransferRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationAccountNumber"));
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
        elemField.setFieldName("paymentCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
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
