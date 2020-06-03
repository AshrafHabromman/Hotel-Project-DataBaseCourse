
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
@Table(name = "MANAGER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m")
    , @NamedQuery(name = "Manager.findByManagerid", query = "SELECT m FROM Manager m WHERE m.managerid = :managerid")
    , @NamedQuery(name = "Manager.findBySalary", query = "SELECT m FROM Manager m WHERE m.salary = :salary")
    , @NamedQuery(name = "Manager.findBySection", query = "SELECT m FROM Manager m WHERE m.section = :section")})
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "MANAGERID")
    private BigDecimal managerid;
    @Basic(optional = false)
    @Column(name = "SALARY")
    private short salary;
    @Basic(optional = false)
    @Column(name = "SECTION")
    private String section;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @OneToOne(optional = false)
    private Person ssn;

    public Manager() {
    }

    public Manager(BigDecimal managerid) {
        this.managerid = managerid;
    }

    public Manager(BigDecimal managerid, short salary, String section) {
        this.managerid = managerid;
        this.salary = salary;
        this.section = section;
    }

    public BigDecimal getManagerid() {
        return managerid;
    }

    public void setManagerid(BigDecimal managerid) {
        this.managerid = managerid;
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

    public Person getSsn() {
        return ssn;
    }

    public void setSsn(Person ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (managerid != null ? managerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) object;
        if ((this.managerid == null && other.managerid != null) || (this.managerid != null && !this.managerid.equals(other.managerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return managerid + "";
    }
    
}

