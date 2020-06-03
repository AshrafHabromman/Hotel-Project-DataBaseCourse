
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelDataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yazan
 */
@Entity
@Table(name = "CATALOGEOFROOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogeofroom.findAll", query = "SELECT c FROM Catalogeofroom c order by c.roomid asc")
    , @NamedQuery(name = "Catalogeofroom.findByRoomid", query = "SELECT c FROM Catalogeofroom c WHERE c.roomid = :roomid order by c.roomid asc")
    , @NamedQuery(name = "Catalogeofroom.findByFloor", query = "SELECT c FROM Catalogeofroom c WHERE c.floor = :floor")
    , @NamedQuery(name = "Catalogeofroom.findByRoomtype", query = "SELECT c FROM Catalogeofroom c WHERE c.roomtype = :roomtype")
    , @NamedQuery(name = "Catalogeofroom.findByDscr", query = "SELECT c FROM Catalogeofroom c WHERE c.dscr = :dscr")
    , @NamedQuery(name = "Catalogeofroom.findByRoomstar", query = "SELECT c FROM Catalogeofroom c WHERE c.roomstar = :roomstar order by c.roomid asc")
    , @NamedQuery(name = "Catalogeofroom.findByPricepernight", query = "SELECT c FROM Catalogeofroom c WHERE c.pricepernight = :pricepernight")
    , @NamedQuery(name = "Catalogeofroom.findByRoomstatus", query = "SELECT c FROM Catalogeofroom c WHERE c.roomstatus = :roomstatus order by c.roomid asc")})
public class Catalogeofroom implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ROOM")
    @SequenceGenerator(name = "ID_ROOM", allocationSize = 1, initialValue = 1, sequenceName = "ID_ROOM", schema = "Ashraf")
    @Basic(optional = false)
    @Column(name = "ROOMID")
    private BigDecimal roomid;
    @Basic(optional = false)
    @Column(name = "FLOOR")
    private short floor;
    @Basic(optional = false)
    @Column(name = "ROOMTYPE")
    private String roomtype;
    @Column(name = "DSCR")
    private String dscr;
    @Basic(optional = false)
    @Column(name = "ROOMSTAR")
    private short roomstar;
    @Basic(optional = false)
    @Column(name = "PRICEPERNIGHT")
    private BigInteger pricepernight;
    @Column(name = "ROOMSTATUS")
    private String roomstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomid")
    private Collection<Payments> paymentsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomid")
    private Collection<Bookingtable> bookingtableCollection;

    public Catalogeofroom() {
    }

    public Catalogeofroom(BigDecimal roomid) {
        this.roomid = roomid;
    }

    public Catalogeofroom(BigDecimal roomid, short floor, String roomtype, short roomstar, BigInteger pricepernight) {
        this.roomid = roomid;
        this.floor = floor;
        this.roomtype = roomtype;
        this.roomstar = roomstar;
        this.pricepernight = pricepernight;
    }

    public BigDecimal getRoomid() {
        return roomid;
    }

    public void setRoomid(BigDecimal roomid) {
        this.roomid = roomid;
    }

    public short getFloor() {
        return floor;
    }

    public void setFloor(short floor) {
        this.floor = floor;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getDscr() {
        return dscr;
    }

    public void setDscr(String dscr) {
        this.dscr = dscr;
    }

    public short getRoomstar() {
        return roomstar;
    }

    public void setRoomstar(short roomstar) {
        this.roomstar = roomstar;
    }

    public BigInteger getPricepernight() {
        return pricepernight;
    }

    public void setPricepernight(BigInteger pricepernight) {
        this.pricepernight = pricepernight;
    }

    public String getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(String roomstatus) {
        this.roomstatus = roomstatus;
    }

    @XmlTransient
    public Collection<Payments> getPaymentsCollection() {
        return paymentsCollection;
    }

    public void setPaymentsCollection(Collection<Payments> paymentsCollection) {
        this.paymentsCollection = paymentsCollection;
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
        hash += (roomid != null ? roomid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogeofroom)) {
            return false;
        }
        Catalogeofroom other = (Catalogeofroom) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return roomid + "";
    }
    
}
