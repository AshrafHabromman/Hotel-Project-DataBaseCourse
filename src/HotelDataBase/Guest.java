
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
@Table(name = "GUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guest.findAll", query = "SELECT g FROM Guest g")
    , @NamedQuery(name = "Guest.findByGuestid", query = "SELECT g FROM Guest g WHERE g.guestid = :guestid")})
public class Guest implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "guestid")
    private Bookingtable bookingtable;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_GUEST")
    @SequenceGenerator(name = "ID_GUEST", allocationSize = 1, initialValue = 1, sequenceName = "ID_GUEST", schema = "Ashraf")
    @Basic(optional = false)
    @Column(name = "GUESTID")
    private BigDecimal guestid;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "guestid")
    private Payments payments;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @OneToOne(optional = false)
    private Person ssn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guestid")
    private Collection<Bookingtable> bookingtableCollection;

    public Guest() {
    }

    public Guest(BigDecimal guestid) {
        this.guestid = guestid;
    }

    public BigDecimal getGuestid() {
        return guestid;
    }

    public void setGuestid(BigDecimal guestid) {
        this.guestid = guestid;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public Person getSsn() {
        return ssn;
    }

    public void setSsn(Person ssn) {
        this.ssn = ssn;
    }

    @XmlTransient
    public Collection<Bookingtable> getBookingtableCollection() {
        return bookingtableCollection;
    }

    public void setBookingtableCollection(Collection<Bookingtable> bookingtableCollection) {
        this.bookingtableCollection = bookingtableCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guestid != null ? guestid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guest)) {
            return false;
        }
        Guest other = (Guest) object;
        if ((this.guestid == null && other.guestid != null) || (this.guestid != null && !this.guestid.equals(other.guestid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return guestid + "";
    }

    public Bookingtable getBookingtable() {
        return bookingtable;
    }

    public void setBookingtable(Bookingtable bookingtable) {
        this.bookingtable = bookingtable;
    }
    
}

