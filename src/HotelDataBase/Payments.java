
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
@Table(name = "PAYMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p")
    , @NamedQuery(name = "Payments.findByPaymentid", query = "SELECT p FROM Payments p WHERE p.paymentid = :paymentid")
    , @NamedQuery(name = "Payments.findByTotalcharge", query = "SELECT p FROM Payments p WHERE p.totalcharge = :totalcharge")
    , @NamedQuery(name = "Payments.findByDateofbill", query = "SELECT p FROM Payments p WHERE p.dateofbill = :dateofbill")})
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PAYMENT")
    @SequenceGenerator(name = "ID_PAYMENT", allocationSize = 1, initialValue = 1, sequenceName = "ID_PAYMENT", schema = "Ashraf")
    @Basic(optional = false)
    @Column(name = "PAYMENTID")
    private BigDecimal paymentid;
    @Basic(optional = false)
    @Column(name = "TOTALCHARGE")
    private BigInteger totalcharge;
    @Basic(optional = false)
    @Column(name = "DATEOFBILL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbill;
    @JoinColumn(name = "BOOKINGID", referencedColumnName = "BOOKINGID")
    @OneToOne(optional = false)
    private Bookingtable bookingid;
    @JoinColumn(name = "ROOMID", referencedColumnName = "ROOMID")
    @ManyToOne(optional = false)
    private Catalogeofroom roomid;
    @JoinColumn(name = "GUESTID", referencedColumnName = "GUESTID")
    @OneToOne(optional = false)
    private Guest guestid;
    @JoinColumn(name = "RESAGENTID", referencedColumnName = "RESERVATIONAGENTID")
    @ManyToOne(optional = false)
    private Reservationagent resagentid;

    public Payments() {
    }

    public Payments(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public Payments(BigDecimal paymentid, BigInteger totalcharge, Date dateofbill) {
        this.paymentid = paymentid;
        this.totalcharge = totalcharge;
        this.dateofbill = dateofbill;
    }

    public BigDecimal getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public BigInteger getTotalcharge() {
        return totalcharge;
    }

    public void setTotalcharge(BigInteger totalcharge) {
        this.totalcharge = totalcharge;
    }

    public Date getDateofbill() {
        return dateofbill;
    }

    public void setDateofbill(Date dateofbill) {
        this.dateofbill = dateofbill;
    }

    public Bookingtable getBookingid() {
        return bookingid;
    }

    public void setBookingid(Bookingtable bookingid) {
        this.bookingid = bookingid;
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

    public Reservationagent getResagentid() {
        return resagentid;
    }

    public void setResagentid(Reservationagent resagentid) {
        this.resagentid = resagentid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentid != null ? paymentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.paymentid == null && other.paymentid != null) || (this.paymentid != null && !this.paymentid.equals(other.paymentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return paymentid + "";
    }
    
}

