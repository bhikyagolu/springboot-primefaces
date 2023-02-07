/**
 * DestinationCardVerificationResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.cartInquiry;

import com.avosh.baseproject.backchannel.model.Message;

public class DestinationCardVerificationResponse extends Message {
    private java.lang.String resultCode;

    private java.lang.String resultDescription;

    private java.lang.String cardOwnerName;

    private java.lang.String isoResultCode;

    public DestinationCardVerificationResponse() {
    }

    public DestinationCardVerificationResponse(
            java.lang.String resultCode,
            java.lang.String resultDescription,
            java.lang.String cardOwnerName,
            java.lang.String isoResultCode) {
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.cardOwnerName = cardOwnerName;
        this.isoResultCode = isoResultCode;
    }


    /**
     * Gets the resultCode value for this DestinationCardVerificationResponse.
     *
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this DestinationCardVerificationResponse.
     *
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this DestinationCardVerificationResponse.
     *
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this DestinationCardVerificationResponse.
     *
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the cardOwnerName value for this DestinationCardVerificationResponse.
     *
     * @return cardOwnerName
     */
    public java.lang.String getCardOwnerName() {
        return cardOwnerName;
    }


    /**
     * Sets the cardOwnerName value for this DestinationCardVerificationResponse.
     *
     * @param cardOwnerName
     */
    public void setCardOwnerName(java.lang.String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }


    /**
     * Gets the isoResultCode value for this DestinationCardVerificationResponse.
     *
     * @return isoResultCode
     */
    public java.lang.String getIsoResultCode() {
        return isoResultCode;
    }


    /**
     * Sets the isoResultCode value for this DestinationCardVerificationResponse.
     *
     * @param isoResultCode
     */
    public void setIsoResultCode(java.lang.String isoResultCode) {
        this.isoResultCode = isoResultCode;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DestinationCardVerificationResponse)) return false;
        DestinationCardVerificationResponse other = (DestinationCardVerificationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.resultCode == null && other.getResultCode() == null) ||
                (this.resultCode != null &&
                        this.resultCode.equals(other.getResultCode()))) &&
                ((this.resultDescription == null && other.getResultDescription() == null) ||
                        (this.resultDescription != null &&
                                this.resultDescription.equals(other.getResultDescription()))) &&
                ((this.cardOwnerName == null && other.getCardOwnerName() == null) ||
                        (this.cardOwnerName != null &&
                                this.cardOwnerName.equals(other.getCardOwnerName()))) &&
                ((this.isoResultCode == null && other.getIsoResultCode() == null) ||
                        (this.isoResultCode != null &&
                                this.isoResultCode.equals(other.getIsoResultCode())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDescription() != null) {
            _hashCode += getResultDescription().hashCode();
        }
        if (getCardOwnerName() != null) {
            _hashCode += getCardOwnerName().hashCode();
        }
        if (getIsoResultCode() != null) {
            _hashCode += getIsoResultCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DestinationCardVerificationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">DestinationCardVerificationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isoResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
