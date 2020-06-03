
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelDataBase;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yazan
 */
@Entity
@Table(name = "PERSON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
    , @NamedQuery(name = "Person.findByFname", query = "SELECT p FROM Person p WHERE p.fname = :fname")
    , @NamedQuery(name = "Person.findByLname", query = "SELECT p FROM Person p WHERE p.lname = :lname")
    , @NamedQuery(name = "Person.findBySsn", query = "SELECT p FROM Person p WHERE p.ssn = :ssn")
    , @NamedQuery(name = "Person.findByCity", query = "SELECT p FROM Person p WHERE p.city = :city")
    , @NamedQuery(name = "Person.findByCountry", query = "SELECT p FROM Person p WHERE p.country = :country")
    , @NamedQuery(name = "Person.findByNationality", query = "SELECT p FROM Person p WHERE p.nationality = :nationality")
    , @NamedQuery(name = "Person.findByCellularphonenum", query = "SELECT p FROM Person p WHERE p.cellularphonenum = :cellularphonenum")
    , @NamedQuery(name = "Person.findByHomephonenum", query = "SELECT p FROM Person p WHERE p.homephonenum = :homephonenum")
    , @NamedQuery(name = "Person.findByZipcode", query = "SELECT p FROM Person p WHERE p.zipcode = :zipcode")
    , @NamedQuery(name = "Person.findByGender", query = "SELECT p FROM Person p WHERE p.gender = :gender")
    , @NamedQuery(name = "Person.findByEmailadd", query = "SELECT p FROM Person p WHERE p.emailadd = :emailadd")
    , @NamedQuery(name = "Person.findByAddress", query = "SELECT p FROM Person p WHERE p.address = :address")
    , @NamedQuery(name = "Person.findByBdate", query = "SELECT p FROM Person p WHERE p.bdate = :bdate")
    ,@NamedQuery (name = "Person.update", query = "update Person p set p.ssn = :SSN ,p.fname = :FNAME ,"
            + "p.lname = :LNAME ,p.city = :CITY ,p.country = :COUNTRY ,p.nationality = :NATIONALITY,"
            + "p.cellularphonenum = :CELLULARPHONENUM,p.homephonenum = :HOMEPHONENUM,p.zipcode = :ZIPCODE,"
            + "p.gender = :GENDER,p.emailadd = :EMAILADD,p.address = :ADDRESS,p.bdate = :BDATE where p.ssn = :SSN")
    ,@NamedQuery(name = "Person.delete", query = "delete from Person  p where p.ssn = :personSsn")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Long ssn;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Basic(optional = false)
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "CELLULARPHONENUM")
    private BigInteger cellularphonenum;
    @Column(name = "HOMEPHONENUM")
    private BigInteger homephonenum;
    @Column(name = "ZIPCODE")
    private BigInteger zipcode;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "EMAILADD")
    private String emailadd;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "BDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bdate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ssn")
    private Reservationagent reservationagent;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ssn")
    private Guest guest;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ssn")
    private Manager manager;

    public Person() {
    }

    public Person(Long ssn) {
        this.ssn = ssn;
    }

    public Person(Long ssn, String fname, String lname, String nationality, String gender) {
        this.ssn = ssn;
        this.fname = fname;
        this.lname = lname;
        this.nationality = nationality;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public BigInteger getCellularphonenum() {
        return cellularphonenum;
    }

    public void setCellularphonenum(BigInteger cellularphonenum) {
        this.cellularphonenum = cellularphonenum;
    }

    public BigInteger getHomephonenum() {
        return homephonenum;
    }

    public void setHomephonenum(BigInteger homephonenum) {
        this.homephonenum = homephonenum;
    }

    public BigInteger getZipcode() {
        return zipcode;
    }

    public void setZipcode(BigInteger zipcode) {
        this.zipcode = zipcode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Reservationagent getReservationagent() {
        return reservationagent;
    }

    public void setReservationagent(Reservationagent reservationagent) {
        this.reservationagent = reservationagent;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssn != null ? ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ssn + "";
    }
    
}

