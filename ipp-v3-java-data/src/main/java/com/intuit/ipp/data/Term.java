//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 * 
 * 				Product: ALL
 * 				Description: The Term entity represents
 * 				the terms under which a sale is made, typically expressed in the
 * 				form of days due after the goods are received. Optionally, a
 * 				discount of the total amount may be applied if payment is made
 * 				within a stipulated time. For example, net 30 indicates that payment
 * 				is due within 30 days. A term of 2%/15 net 60 indicates that payment
 * 				is due within 60 days, with a discount of 2% if payment is made
 * 				within 15 days. Term also supports: an absolute due date, a number
 * 				of days from a start date, a percent discount, or an absolute
 * 				discount.
 * 			
 * 
 * <p>Java class for Term complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="DueDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="DiscountDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="DayOfMonthDue" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *             &lt;element name="DueNextMonthDays" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *             &lt;element name="DiscountDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="SalesTermEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Term", propOrder = {
    "name",
    "active",
    "type",
    "discountPercent",
    "dueDays",
    "discountDays",
    "dayOfMonthDue",
    "dueNextMonthDays",
    "discountDayOfMonth",
    "salesTermEx"
})
public class Term
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DueDays")
    protected Integer dueDays;
    @XmlElement(name = "DiscountDays")
    protected Integer discountDays;
    @XmlElement(name = "DayOfMonthDue")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dayOfMonthDue;
    @XmlElement(name = "DueNextMonthDays")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dueNextMonthDays;
    @XmlElement(name = "DiscountDayOfMonth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger discountDayOfMonth;
    @XmlElement(name = "SalesTermEx")
    protected IntuitAnyType salesTermEx;

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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the dueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDueDays() {
        return dueDays;
    }

    /**
     * Sets the value of the dueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDueDays(Integer value) {
        this.dueDays = value;
    }

    /**
     * Gets the value of the discountDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDays() {
        return discountDays;
    }

    /**
     * Sets the value of the discountDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDays(Integer value) {
        this.discountDays = value;
    }

    /**
     * Gets the value of the dayOfMonthDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOfMonthDue() {
        return dayOfMonthDue;
    }

    /**
     * Sets the value of the dayOfMonthDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOfMonthDue(BigInteger value) {
        this.dayOfMonthDue = value;
    }

    /**
     * Gets the value of the dueNextMonthDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDueNextMonthDays() {
        return dueNextMonthDays;
    }

    /**
     * Sets the value of the dueNextMonthDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDueNextMonthDays(BigInteger value) {
        this.dueNextMonthDays = value;
    }

    /**
     * Gets the value of the discountDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountDayOfMonth() {
        return discountDayOfMonth;
    }

    /**
     * Sets the value of the discountDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscountDayOfMonth(BigInteger value) {
        this.discountDayOfMonth = value;
    }

    /**
     * Gets the value of the salesTermEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getSalesTermEx() {
        return salesTermEx;
    }

    /**
     * Sets the value of the salesTermEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setSalesTermEx(IntuitAnyType value) {
        this.salesTermEx = value;
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
        final Term that = ((Term) object);
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
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountPercent;
            lhsDiscountPercent = this.getDiscountPercent();
            BigDecimal rhsDiscountPercent;
            rhsDiscountPercent = that.getDiscountPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountPercent", lhsDiscountPercent), LocatorUtils.property(thatLocator, "discountPercent", rhsDiscountPercent), lhsDiscountPercent, rhsDiscountPercent, (this.discountPercent!= null), (that.discountPercent!= null))) {
                return false;
            }
        }
        {
            Integer lhsDueDays;
            lhsDueDays = this.getDueDays();
            Integer rhsDueDays;
            rhsDueDays = that.getDueDays();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dueDays", lhsDueDays), LocatorUtils.property(thatLocator, "dueDays", rhsDueDays), lhsDueDays, rhsDueDays, (this.dueDays!= null), (that.dueDays!= null))) {
                return false;
            }
        }
        {
            Integer lhsDiscountDays;
            lhsDiscountDays = this.getDiscountDays();
            Integer rhsDiscountDays;
            rhsDiscountDays = that.getDiscountDays();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountDays", lhsDiscountDays), LocatorUtils.property(thatLocator, "discountDays", rhsDiscountDays), lhsDiscountDays, rhsDiscountDays, (this.discountDays!= null), (that.discountDays!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsDayOfMonthDue;
            lhsDayOfMonthDue = this.getDayOfMonthDue();
            BigInteger rhsDayOfMonthDue;
            rhsDayOfMonthDue = that.getDayOfMonthDue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayOfMonthDue", lhsDayOfMonthDue), LocatorUtils.property(thatLocator, "dayOfMonthDue", rhsDayOfMonthDue), lhsDayOfMonthDue, rhsDayOfMonthDue, (this.dayOfMonthDue!= null), (that.dayOfMonthDue!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsDueNextMonthDays;
            lhsDueNextMonthDays = this.getDueNextMonthDays();
            BigInteger rhsDueNextMonthDays;
            rhsDueNextMonthDays = that.getDueNextMonthDays();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dueNextMonthDays", lhsDueNextMonthDays), LocatorUtils.property(thatLocator, "dueNextMonthDays", rhsDueNextMonthDays), lhsDueNextMonthDays, rhsDueNextMonthDays, (this.dueNextMonthDays!= null), (that.dueNextMonthDays!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsDiscountDayOfMonth;
            lhsDiscountDayOfMonth = this.getDiscountDayOfMonth();
            BigInteger rhsDiscountDayOfMonth;
            rhsDiscountDayOfMonth = that.getDiscountDayOfMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountDayOfMonth", lhsDiscountDayOfMonth), LocatorUtils.property(thatLocator, "discountDayOfMonth", rhsDiscountDayOfMonth), lhsDiscountDayOfMonth, rhsDiscountDayOfMonth, (this.discountDayOfMonth!= null), (that.discountDayOfMonth!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsSalesTermEx;
            lhsSalesTermEx = this.getSalesTermEx();
            IntuitAnyType rhsSalesTermEx;
            rhsSalesTermEx = that.getSalesTermEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTermEx", lhsSalesTermEx), LocatorUtils.property(thatLocator, "salesTermEx", rhsSalesTermEx), lhsSalesTermEx, rhsSalesTermEx, (this.salesTermEx!= null), (that.salesTermEx!= null))) {
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
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            BigDecimal theDiscountPercent;
            theDiscountPercent = this.getDiscountPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountPercent", theDiscountPercent), currentHashCode, theDiscountPercent, (this.discountPercent!= null));
        }
        {
            Integer theDueDays;
            theDueDays = this.getDueDays();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueDays", theDueDays), currentHashCode, theDueDays, (this.dueDays!= null));
        }
        {
            Integer theDiscountDays;
            theDiscountDays = this.getDiscountDays();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountDays", theDiscountDays), currentHashCode, theDiscountDays, (this.discountDays!= null));
        }
        {
            BigInteger theDayOfMonthDue;
            theDayOfMonthDue = this.getDayOfMonthDue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayOfMonthDue", theDayOfMonthDue), currentHashCode, theDayOfMonthDue, (this.dayOfMonthDue!= null));
        }
        {
            BigInteger theDueNextMonthDays;
            theDueNextMonthDays = this.getDueNextMonthDays();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueNextMonthDays", theDueNextMonthDays), currentHashCode, theDueNextMonthDays, (this.dueNextMonthDays!= null));
        }
        {
            BigInteger theDiscountDayOfMonth;
            theDiscountDayOfMonth = this.getDiscountDayOfMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountDayOfMonth", theDiscountDayOfMonth), currentHashCode, theDiscountDayOfMonth, (this.discountDayOfMonth!= null));
        }
        {
            IntuitAnyType theSalesTermEx;
            theSalesTermEx = this.getSalesTermEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTermEx", theSalesTermEx), currentHashCode, theSalesTermEx, (this.salesTermEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
