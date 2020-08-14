/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author saotr
 */
@Entity
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findById", query = "SELECT s FROM Student s WHERE s.id = :id")
    , @NamedQuery(name = "Student.findByFullname", query = "SELECT s FROM Student s WHERE s.fullname = :fullname")
    , @NamedQuery(name = "Student.findByBirdday", query = "SELECT s FROM Student s WHERE s.birdday = :birdday")
    , @NamedQuery(name = "Student.findByBirdplace", query = "SELECT s FROM Student s WHERE s.birdplace = :birdplace")
    , @NamedQuery(name = "Student.findByIdclass", query = "SELECT s FROM Student s WHERE s.idclass = :idclass")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 30)
    @Column(name = "fullname")
    private String fullname;
    @Size(max = 30)
    @Column(name = "birdday")
    private String birdday;
    @Size(max = 30)
    @Column(name = "birdplace")
    private String birdplace;
    @Size(max = 30)
    @Column(name = "idclass")
    private String idclass;

    public Student() {
    }

    public Student(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirdday() {
        return birdday;
    }

    public void setBirdday(String birdday) {
        this.birdday = birdday;
    }

    public String getBirdplace() {
        return birdplace;
    }

    public void setBirdplace(String birdplace) {
        this.birdplace = birdplace;
    }

    public String getIdclass() {
        return idclass;
    }

    public void setIdclass(String idclass) {
        this.idclass = idclass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Student[ id=" + id + " ]";
    }
    
}
