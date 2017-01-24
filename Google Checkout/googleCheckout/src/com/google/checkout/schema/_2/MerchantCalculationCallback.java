//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.10 at 05:31:30 PM PDT 
//


package com.google.checkout.schema._2;


/**
 * Java content class for MerchantCalculationCallback complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/colinc/projects/apache-tomcat-5.5.12/apiv2.xsd line 559)
 * <p>
 * <pre>
 * &lt;complexType name="MerchantCalculationCallback">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="buyer-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="buyer-language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calculate" type="{http://checkout.google.com/schema/2}Calculate"/>
 *         &lt;element name="shopping-cart" type="{http://checkout.google.com/schema/2}ShoppingCart"/>
 *       &lt;/all>
 *       &lt;attribute name="serial-number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface MerchantCalculationCallback {


    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSerialNumber();

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSerialNumber(java.lang.String value);

    /**
     * Gets the value of the buyerLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getBuyerLanguage();

    /**
     * Sets the value of the buyerLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setBuyerLanguage(java.lang.String value);

    /**
     * Gets the value of the calculate property.
     * 
     * @return
     *     possible object is
     *     {@link com.google.checkout.schema._2.Calculate}
     */
    com.google.checkout.schema._2.Calculate getCalculate();

    /**
     * Sets the value of the calculate property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.google.checkout.schema._2.Calculate}
     */
    void setCalculate(com.google.checkout.schema._2.Calculate value);

    /**
     * Gets the value of the shoppingCart property.
     * 
     * @return
     *     possible object is
     *     {@link com.google.checkout.schema._2.ShoppingCart}
     */
    com.google.checkout.schema._2.ShoppingCart getShoppingCart();

    /**
     * Sets the value of the shoppingCart property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.google.checkout.schema._2.ShoppingCart}
     */
    void setShoppingCart(com.google.checkout.schema._2.ShoppingCart value);

    /**
     * Gets the value of the buyerId property.
     * 
     */
    long getBuyerId();

    /**
     * Sets the value of the buyerId property.
     * 
     */
    void setBuyerId(long value);

}
