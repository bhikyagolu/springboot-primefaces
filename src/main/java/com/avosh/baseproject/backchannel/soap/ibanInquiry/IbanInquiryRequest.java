/**
 * IbanInquiryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.ibanInquiry;

public class IbanInquiryRequest  implements java.io.Serializable {
    private com.avosh.baseproject.backchannel.soap.ibanInquiry.Credential credential;

    private java.lang.String IBAN;

    private java.lang.String nationalCode;

    public IbanInquiryRequest() {
    }

    public IbanInquiryRequest(
           com.avosh.baseproject.backchannel.soap.ibanInquiry.Credential credential,
           java.lang.String IBAN,
           java.lang.String nationalCode) {
           this.credential = credential;
           this.IBAN = IBAN;
           this.nationalCode = nationalCode;
    }


    /**
     * Gets the credential value for this IbanInquiryRequest.
     * 
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.ibanInquiry.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this IbanInquiryRequest.
     * 
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.ibanInquiry.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the IBAN value for this IbanInquiryRequest.
     * 
     * @return IBAN
     */
    public java.lang.String getIBAN() {
        return IBAN;
    }


    /**
     * Sets the IBAN value for this IbanInquiryRequest.
     * 
     * @param IBAN
     */
    public void setIBAN(java.lang.String IBAN) {
        this.IBAN = IBAN;
    }


    /**
     * Gets the nationalCode value for this IbanInquiryRequest.
     * 
     * @return nationalCode
     */
    public java.lang.String getNationalCode() {
        return nationalCode;
    }


    /**
     * Sets the nationalCode value for this IbanInquiryRequest.
     * 
     * @param nationalCode
     */
    public void setNationalCode(java.lang.String nationalCode) {
        this.nationalCode = nationalCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IbanInquiryRequest)) return false;
        IbanInquiryRequest other = (IbanInquiryRequest) obj;
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
            ((this.IBAN==null && other.getIBAN()==null) || 
             (this.IBAN!=null &&
              this.IBAN.equals(other.getIBAN()))) &&
            ((this.nationalCode==null && other.getNationalCode()==null) || 
             (this.nationalCode!=null &&
              this.nationalCode.equals(other.getNationalCode())));
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
        if (getIBAN() != null) {
            _hashCode += getIBAN().hashCode();
        }
        if (getNationalCode() != null) {
            _hashCode += getNationalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IbanInquiryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">IbanInquiryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalCode"));
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

}
