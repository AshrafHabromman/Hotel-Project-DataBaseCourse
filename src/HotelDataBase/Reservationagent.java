
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelDataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yazan
 */
@Entity
@Table(name = "RESERVATIONAGENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservationagent.findAll", query = "SELECT r FROM Reservationagent r")
    , @NamedQuery(name = "Reservationagent.findByReservationagentid", query = "SELECT r FROM Reservationagent r WHERE r.reservationagentid = :reservationagentid")
    , @NamedQuery(name = "Reservationagent.findBySalary", query = "SELECT r FROM Reservationagent r WHERE r.salary = :salary")
    , @NamedQuery(name = "Reservationagent.findBySection", query = "SELECT r FROM Reservationagent r WHERE r.section = :section")
    ,@NamedQuery (name = "Reservationagent.update", query = "update Reservationagent r set r.section = :section ,r.salary = :salary "
            + "where r.reservationagentid = :RESERVATIONAGENTID")
    ,@NamedQuery(name = "Reservationagent.delete", query = "delete from Reservationagent  r where r.reservationagentid = :reservagentId")})
public class Reservationagent implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_RES")
    @SequenceGenerator(name = "ID_RES", allocationSize = 1, initialValue = 1, sequenceName = "ID_RES", schema = "Ashraf")
    @Basic(optional = false)
    @Column(name = "RESERVATIONAGENTID")
    private BigDecimal reservationagentid;
    @Basic(optional = false)
    @Column(name = "SALARY")
    private short salary;
    @Basic(optional = false)
    @Column(name = "SECTION")
    private String section;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rid")
    private Collection<Bookingby> bookingbyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resagentid")
    private Collection<Payments> paymentsCollection;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @OneToOne(optional = false)
    private Person ssn;

    public Reservationagent() {
    }

    public Reservationagent(BigDecimal reservationagentid) {
        this.reservationagentid = reservationagentid;
    }

    public Reservationagent(BigDecimal reservationagentid, short salary, String section) {
        this.reservationagentid = reservationagentid;
        this.salary = salary;
        this.section = section;
    }

    public BigDecimal getReservationagentid() {
        return reservationagentid;
    }

    public void setReservationagentid(BigDecimal reservationagentid) {
        this.reservationagentid = reservationagentid;
    }

    public short getSalary() {
        return salary;
    }

    public void setSalary(short salary) {
        this.salary = salary;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @XmlTransient
    public Collection<Bookingby> getBookingbyCollection() {
        return bookingbyCollection;
    }

    public void setBookingbyCollection(Collection<Bookingby> bookingbyCollection) {
        this.bookingbyCollection = bookingbyCollection;
    }

    @XmlTransient
    public Collection<Payments> getPaymentsCollection() {
        return paymentsCollection;
    }

    public void setPaymentsCollection(Collection<Payments> paymentsCollection) {
        this.paymentsCollection = paymentsCollection;
    }

    public Person getSsn() {
        return ssn;
    }

    public void setSsn(Person ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservationagentid != null ? reservationagentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservationagent)) {
            return false;
        }
        Reservationagent other = (Reservationagent) object;
        if ((this.reservationagentid == null && other.reservationagentid != null) || (this.reservationagentid != null && !this.reservationagentid.equals(other.reservationagentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return reservationagentid + "";
    }
    
}

