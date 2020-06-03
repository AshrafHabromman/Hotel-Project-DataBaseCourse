
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelDataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yazan
 */
@Entity
@Table(name = "BOOKINGTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookingtable.findAll", query = "SELECT b FROM Bookingtable b")
    , @NamedQuery(name = "Bookingtable.findByBookingid", query = "SELECT b FROM Bookingtable b WHERE b.bookingid = :bookingid")
    , @NamedQuery(name = "Bookingtable.findByDatefrom", query = "SELECT b FROM Bookingtable b WHERE b.datefrom = :datefrom")
    , @NamedQuery(name = "Bookingtable.findByDateto", query = "SELECT b FROM Bookingtable b WHERE b.dateto = :dateto")
    , @NamedQuery(name = "Bookingtable.findByBookingstatus", query = "SELECT b FROM Bookingtable b WHERE b.bookingstatus = :bookingstatus")})
public class Bookingtable implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_BOOKING")
    @SequenceGenerator(name = "ID_BOOKING", allocationSize = 1, initialValue = 1, sequenceName = "ID_BOOKING", schema = "Ashraf")
    @Basic(optional = false)
    @Column(name = "BOOKINGID")
    private BigDecimal bookingid;
    @Basic(optional = false)
    @Column(name = "DATEFROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datefrom;
    @Column(name = "DATETO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateto;
    @Basic(optional = false)
    @Column(name = "BOOKINGSTATUS")
    private BigInteger bookingstatus;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "bookingtable")
    private Bookingby bookingby;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "bookingid")
    private Payments payments;
    @JoinColumn(name = "ROOMID", referencedColumnName = "ROOMID")
    @ManyToOne(optional = false)
    private Catalogeofroom roomid;
    @JoinColumn(name = "GUESTID", referencedColumnName = "GUESTID")
    @ManyToOne(optional = false)
    private Guest guestid;

    public Bookingtable() {
    }

    public Bookingtable(BigDecimal bookingid) {
        this.bookingid = bookingid;
    }

    public Bookingtable(BigDecimal bookingid, Date datefrom, BigInteger bookingstatus) {
        this.bookingid = bookingid;
        this.datefrom = datefrom;
        this.bookingstatus = bookingstatus;
    }

    public BigDecimal getBookingid() {
        return bookingid;
    }

    public void setBookingid(BigDecimal bookingid) {
        this.bookingid = bookingid;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDateto() {
        return dateto;
    }

    public void setDateto(Date dateto) {
        this.dateto = dateto;
    }

    public BigInteger getBookingstatus() {
        return bookingstatus;
    }

    public void setBookingstatus(BigInteger bookingstatus) {
        this.bookingstatus = bookingstatus;
    }

    public Bookingby getBookingby() {
        return bookingby;
    }

    public void setBookingby(Bookingby bookingby) {
        this.bookingby = bookingby;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public Catalogeofroom getRoomid() {
        return roomid;
    }

    public void setRoomid(Catalogeofroom roomid) {
        this.roomid = roomid;
    }

    public Guest getGuestid() {
        return guestid;
    }

    public void setGuestid(Guest guestid) {
        this.guestid = guestid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingid != null ? bookingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookingtable)) {
            return false;
        }
        Bookingtable other = (Bookingtable) object;
        if ((this.bookingid == null && other.bookingid != null) || (this.bookingid != null && !this.bookingid.equals(other.bookingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return bookingid + "";
    }
    
}
