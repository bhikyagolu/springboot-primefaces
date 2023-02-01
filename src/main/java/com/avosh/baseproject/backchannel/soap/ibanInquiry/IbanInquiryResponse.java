/**
 * IbanInquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.ibanInquiry;

public class IbanInquiryResponse  implements java.io.Serializable {
    private java.lang.String resultCode;

    private java.lang.String resultDescription;

    private java.lang.String accountOwner;

    private java.lang.String status;

    private java.lang.String nationalCodeValidityStatus;

    public IbanInquiryResponse() {
    }

    public IbanInquiryResponse(
           java.lang.String resultCode,
           java.lang.String resultDescription,
           java.lang.String accountOwner,
           java.lang.String status,
           java.lang.String nationalCodeValidityStatus) {
           this.resultCode = resultCode;
           this.resultDescription = resultDescription;
           this.accountOwner = accountOwner;
           this.status = status;
           this.nationalCodeValidityStatus = nationalCodeValidityStatus;
    }


    /**
     * Gets the resultCode value for this IbanInquiryResponse.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this IbanInquiryResponse.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this IbanInquiryResponse.
     * 
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this IbanInquiryResponse.
     * 
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the accountOwner value for this IbanInquiryResponse.
     * 
     * @return accountOwner
     */
    public java.lang.String getAccountOwner() {
        return accountOwner;
    }


    /**
     * Sets the accountOwner value for this IbanInquiryResponse.
     * 
     * @param accountOwner
     */
    public void setAccountOwner(java.lang.String accountOwner) {
        this.accountOwner = accountOwner;
    }


    /**
     * Gets the status value for this IbanInquiryResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this IbanInquiryResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the nationalCodeValidityStatus value for this IbanInquiryResponse.
     * 
     * @return nationalCodeValidityStatus
     */
    public java.lang.String getNationalCodeValidityStatus() {
        return nationalCodeValidityStatus;
    }


    /**
     * Sets the nationalCodeValidityStatus value for this IbanInquiryResponse.
     * 
     * @param nationalCodeValidityStatus
     */
    public void setNationalCodeValidityStatus(java.lang.String nationalCodeValidityStatus) {
        this.nationalCodeValidityStatus = nationalCodeValidityStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IbanInquiryResponse)) return false;
        IbanInquiryResponse other = (IbanInquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultDescription==null && other.getResultDescription()==null) || 
             (this.resultDescription!=null &&
              this.resultDescription.equals(other.getResultDescription()))) &&
            ((this.accountOwner==null && other.getAccountOwner()==null) || 
             (this.accountOwner!=null &&
              this.accountOwner.equals(other.getAccountOwner()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.nationalCodeValidityStatus==null && other.getNationalCodeValidityStatus()==null) || 
             (this.nationalCodeValidityStatus!=null &&
              this.nationalCodeValidityStatus.equals(other.getNationalCodeValidityStatus())));
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
        if (getAccountOwner() != null) {
            _hashCode += getAccountOwner().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getNationalCodeValidityStatus() != null) {
            _hashCode += getNationalCodeValidityStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IbanInquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">IbanInquiryResponse"));
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
        elemField.setFieldName("accountOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalCodeValidityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalCodeValidityStatus"));
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
