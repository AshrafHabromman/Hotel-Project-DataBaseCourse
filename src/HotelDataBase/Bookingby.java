/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelDataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yazan
 */
@Entity
@Table(name = "BOOKINGBY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookingby.findAll", query = "SELECT b FROM Bookingby b")
    , @NamedQuery(name = "Bookingby.findByBid", query = "SELECT b FROM Bookingby b WHERE b.bid = :bid")})
public class Bookingby implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "BID")
    private BigDecimal bid;
    @JoinColumn(name = "BID", referencedColumnName = "BOOKINGID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Bookingtable bookingtable;
    @JoinColumn(name = "RID", referencedColumnName = "RESERVATIONAGENTID")
    @ManyToOne(optional = false)
    private Reservationagent rid;

    public Bookingby() {
    }

    public Bookingby(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public Bookingtable getBookingtable() {
        return bookingtable;
    }

    public void setBookingtable(Bookingtable bookingtable) {
        this.bookingtable = bookingtable;
    }

    public Reservationagent getRid() {
        return rid;
    }

    public void setRid(Reservationagent rid) {
        this.rid = rid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bid != null ? bid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookingby)) {
            return false;
        }
        Bookingby other = (Bookingby) object;
        if ((this.bid == null && other.bid != null) || (this.bid != null && !this.bid.equals(other.bid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return bid + "";
    }
    
}
