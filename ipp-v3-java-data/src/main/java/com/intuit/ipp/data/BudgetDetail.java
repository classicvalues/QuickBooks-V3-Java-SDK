//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Describes budget details for each budget
 * 			
 * 
 * <p>Java class for BudgetDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BudgetDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetDetail", propOrder = {
    "budgetDate",
    "amount",
    "accountRef",
    "customerRef",
    "classRef",
    "departmentRef"
})
public class BudgetDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BudgetDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date budgetDate;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "AccountRef")
    protected ReferenceType accountRef;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "DepartmentRef")
    protected ReferenceType departmentRef;

    /**
     * Gets the value of the budgetDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBudgetDate() {
        return budgetDate;
    }

    /**
     * Sets the value of the budgetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetDate(Date value) {
        this.budgetDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountRef(ReferenceType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the departmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    /**
     * Sets the value of the departmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepartmentRef(ReferenceType value) {
        this.departmentRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BudgetDetail that = ((BudgetDetail) object);
        {
            Date lhsBudgetDate;
            lhsBudgetDate = this.getBudgetDate();
            Date rhsBudgetDate;
            rhsBudgetDate = that.getBudgetDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "budgetDate", lhsBudgetDate), LocatorUtils.property(thatLocator, "budgetDate", rhsBudgetDate), lhsBudgetDate, rhsBudgetDate, (this.budgetDate!= null), (that.budgetDate!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAmount;
            lhsAmount = this.getAmount();
            BigDecimal rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAccountRef;
            lhsAccountRef = this.getAccountRef();
            ReferenceType rhsAccountRef;
            rhsAccountRef = that.getAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRef", lhsAccountRef), LocatorUtils.property(thatLocator, "accountRef", rhsAccountRef), lhsAccountRef, rhsAccountRef, (this.accountRef!= null), (that.accountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef, (this.customerRef!= null), (that.customerRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDepartmentRef;
            lhsDepartmentRef = this.getDepartmentRef();
            ReferenceType rhsDepartmentRef;
            rhsDepartmentRef = that.getDepartmentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departmentRef", lhsDepartmentRef), LocatorUtils.property(thatLocator, "departmentRef", rhsDepartmentRef), lhsDepartmentRef, rhsDepartmentRef, (this.departmentRef!= null), (that.departmentRef!= null))) {
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
        int currentHashCode = 1;
        {
            Date theBudgetDate;
            theBudgetDate = this.getBudgetDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "budgetDate", theBudgetDate), currentHashCode, theBudgetDate, (this.budgetDate!= null));
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            ReferenceType theAccountRef;
            theAccountRef = this.getAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRef", theAccountRef), currentHashCode, theAccountRef, (this.accountRef!= null));
        }
        {
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef, (this.customerRef!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        {
            ReferenceType theDepartmentRef;
            theDepartmentRef = this.getDepartmentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departmentRef", theDepartmentRef), currentHashCode, theDepartmentRef, (this.departmentRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
