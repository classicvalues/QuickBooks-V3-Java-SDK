//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * The UOM type defines the data used to represent a
 * 				set of equivalent units and the conversion rates to other related
 * 				units. It allows showing what quantities, prices, rates, and costs
 * 				are based on.	
 * 
 * <p>Java class for UOM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Abbrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseType" type="{http://schema.intuit.com/finance/v3}UOMBaseTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="ConvUnit" type="{http://schema.intuit.com/finance/v3}UOMConvUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOM", propOrder = {
    "name",
    "abbrv",
    "baseType",
    "convUnit"
})
public class UOM
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Abbrv")
    protected String abbrv;
    @XmlElement(name = "BaseType")
    @XmlSchemaType(name = "string")
    protected UOMBaseTypeEnum baseType;
    @XmlElement(name = "ConvUnit")
    protected List<UOMConvUnit> convUnit;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrv() {
        return abbrv;
    }

    /**
     * Sets the value of the abbrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrv(String value) {
        this.abbrv = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link UOMBaseTypeEnum }
     *     
     */
    public UOMBaseTypeEnum getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMBaseTypeEnum }
     *     
     */
    public void setBaseType(UOMBaseTypeEnum value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the convUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOMConvUnit }
     * 
     * 
     */
    public List<UOMConvUnit> getConvUnit() {
        if (convUnit == null) {
            convUnit = new ArrayList<UOMConvUnit>();
        }
        return this.convUnit;
    }

    /**
     * Sets the value of the convUnit property.
     * 
     * @param convUnit
     *     allowed object is
     *     {@link UOMConvUnit }
     *     
     */
    public void setConvUnit(List<UOMConvUnit> convUnit) {
        this.convUnit = convUnit;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UOM that = ((UOM) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsAbbrv;
            lhsAbbrv = this.getAbbrv();
            String rhsAbbrv;
            rhsAbbrv = that.getAbbrv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbrv", lhsAbbrv), LocatorUtils.property(thatLocator, "abbrv", rhsAbbrv), lhsAbbrv, rhsAbbrv, (this.abbrv!= null), (that.abbrv!= null))) {
                return false;
            }
        }
        {
            UOMBaseTypeEnum lhsBaseType;
            lhsBaseType = this.getBaseType();
            UOMBaseTypeEnum rhsBaseType;
            rhsBaseType = that.getBaseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseType", lhsBaseType), LocatorUtils.property(thatLocator, "baseType", rhsBaseType), lhsBaseType, rhsBaseType, (this.baseType!= null), (that.baseType!= null))) {
                return false;
            }
        }
        {
            List<UOMConvUnit> lhsConvUnit;
            lhsConvUnit = (((this.convUnit!= null)&&(!this.convUnit.isEmpty()))?this.getConvUnit():null);
            List<UOMConvUnit> rhsConvUnit;
            rhsConvUnit = (((that.convUnit!= null)&&(!that.convUnit.isEmpty()))?that.getConvUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convUnit", lhsConvUnit), LocatorUtils.property(thatLocator, "convUnit", rhsConvUnit), lhsConvUnit, rhsConvUnit, ((this.convUnit!= null)&&(!this.convUnit.isEmpty())), ((that.convUnit!= null)&&(!that.convUnit.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theAbbrv;
            theAbbrv = this.getAbbrv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbrv", theAbbrv), currentHashCode, theAbbrv, (this.abbrv!= null));
        }
        {
            UOMBaseTypeEnum theBaseType;
            theBaseType = this.getBaseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseType", theBaseType), currentHashCode, theBaseType, (this.baseType!= null));
        }
        {
            List<UOMConvUnit> theConvUnit;
            theConvUnit = (((this.convUnit!= null)&&(!this.convUnit.isEmpty()))?this.getConvUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convUnit", theConvUnit), currentHashCode, theConvUnit, ((this.convUnit!= null)&&(!this.convUnit.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
