//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Transaction recording a payment from the customer
 * 				held in the Undeposited Funds account into the Bank account.
 * 			
 * 
 * <p>Java class for Deposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deposit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepositToAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="CashBack" type="{http://schema.intuit.com/finance/v3}CashBackInfo" minOccurs="0"/&gt;
 *         &lt;element name="GlobalTaxCalculation" type="{http://schema.intuit.com/finance/v3}GlobalTaxCalculationEnum" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HomeTotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DepositEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deposit", propOrder = {
    "depositToAccountRef",
    "cashBack",
    "globalTaxCalculation",
    "totalAmt",
    "homeTotalAmt",
    "depositEx"
})
public class Deposit
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DepositToAccountRef")
    protected ReferenceType depositToAccountRef;
    @XmlElement(name = "CashBack")
    protected CashBackInfo cashBack;
    @XmlElement(name = "GlobalTaxCalculation")
    @XmlSchemaType(name = "string")
    protected GlobalTaxCalculationEnum globalTaxCalculation;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "HomeTotalAmt")
    protected BigDecimal homeTotalAmt;
    @XmlElement(name = "DepositEx")
    protected IntuitAnyType depositEx;

    /**
     * Gets the value of the depositToAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepositToAccountRef() {
        return depositToAccountRef;
    }

    /**
     * Sets the value of the depositToAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepositToAccountRef(ReferenceType value) {
        this.depositToAccountRef = value;
    }

    /**
     * Gets the value of the cashBack property.
     * 
     * @return
     *     possible object is
     *     {@link CashBackInfo }
     *     
     */
    public CashBackInfo getCashBack() {
        return cashBack;
    }

    /**
     * Sets the value of the cashBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBackInfo }
     *     
     */
    public void setCashBack(CashBackInfo value) {
        this.cashBack = value;
    }

    /**
     * Gets the value of the globalTaxCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalTaxCalculationEnum }
     *     
     */
    public GlobalTaxCalculationEnum getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    /**
     * Sets the value of the globalTaxCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalTaxCalculationEnum }
     *     
     */
    public void setGlobalTaxCalculation(GlobalTaxCalculationEnum value) {
        this.globalTaxCalculation = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the homeTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeTotalAmt() {
        return homeTotalAmt;
    }

    /**
     * Sets the value of the homeTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeTotalAmt(BigDecimal value) {
        this.homeTotalAmt = value;
    }

    /**
     * Gets the value of the depositEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getDepositEx() {
        return depositEx;
    }

    /**
     * Sets the value of the depositEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setDepositEx(IntuitAnyType value) {
        this.depositEx = value;
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
        final Deposit that = ((Deposit) object);
        {
            ReferenceType lhsDepositToAccountRef;
            lhsDepositToAccountRef = this.getDepositToAccountRef();
            ReferenceType rhsDepositToAccountRef;
            rhsDepositToAccountRef = that.getDepositToAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depositToAccountRef", lhsDepositToAccountRef), LocatorUtils.property(thatLocator, "depositToAccountRef", rhsDepositToAccountRef), lhsDepositToAccountRef, rhsDepositToAccountRef, (this.depositToAccountRef!= null), (that.depositToAccountRef!= null))) {
                return false;
            }
        }
        {
            CashBackInfo lhsCashBack;
            lhsCashBack = this.getCashBack();
            CashBackInfo rhsCashBack;
            rhsCashBack = that.getCashBack();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cashBack", lhsCashBack), LocatorUtils.property(thatLocator, "cashBack", rhsCashBack), lhsCashBack, rhsCashBack, (this.cashBack!= null), (that.cashBack!= null))) {
                return false;
            }
        }
        {
            GlobalTaxCalculationEnum lhsGlobalTaxCalculation;
            lhsGlobalTaxCalculation = this.getGlobalTaxCalculation();
            GlobalTaxCalculationEnum rhsGlobalTaxCalculation;
            rhsGlobalTaxCalculation = that.getGlobalTaxCalculation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "globalTaxCalculation", lhsGlobalTaxCalculation), LocatorUtils.property(thatLocator, "globalTaxCalculation", rhsGlobalTaxCalculation), lhsGlobalTaxCalculation, rhsGlobalTaxCalculation, (this.globalTaxCalculation!= null), (that.globalTaxCalculation!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt, (this.totalAmt!= null), (that.totalAmt!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHomeTotalAmt;
            lhsHomeTotalAmt = this.getHomeTotalAmt();
            BigDecimal rhsHomeTotalAmt;
            rhsHomeTotalAmt = that.getHomeTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeTotalAmt", lhsHomeTotalAmt), LocatorUtils.property(thatLocator, "homeTotalAmt", rhsHomeTotalAmt), lhsHomeTotalAmt, rhsHomeTotalAmt, (this.homeTotalAmt!= null), (that.homeTotalAmt!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsDepositEx;
            lhsDepositEx = this.getDepositEx();
            IntuitAnyType rhsDepositEx;
            rhsDepositEx = that.getDepositEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depositEx", lhsDepositEx), LocatorUtils.property(thatLocator, "depositEx", rhsDepositEx), lhsDepositEx, rhsDepositEx, (this.depositEx!= null), (that.depositEx!= null))) {
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
            ReferenceType theDepositToAccountRef;
            theDepositToAccountRef = this.getDepositToAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depositToAccountRef", theDepositToAccountRef), currentHashCode, theDepositToAccountRef, (this.depositToAccountRef!= null));
        }
        {
            CashBackInfo theCashBack;
            theCashBack = this.getCashBack();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cashBack", theCashBack), currentHashCode, theCashBack, (this.cashBack!= null));
        }
        {
            GlobalTaxCalculationEnum theGlobalTaxCalculation;
            theGlobalTaxCalculation = this.getGlobalTaxCalculation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "globalTaxCalculation", theGlobalTaxCalculation), currentHashCode, theGlobalTaxCalculation, (this.globalTaxCalculation!= null));
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt, (this.totalAmt!= null));
        }
        {
            BigDecimal theHomeTotalAmt;
            theHomeTotalAmt = this.getHomeTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeTotalAmt", theHomeTotalAmt), currentHashCode, theHomeTotalAmt, (this.homeTotalAmt!= null));
        }
        {
            IntuitAnyType theDepositEx;
            theDepositEx = this.getDepositEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depositEx", theDepositEx), currentHashCode, theDepositEx, (this.depositEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
