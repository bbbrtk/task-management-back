package pl.project.promanage.company;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String country;

    private String location;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfEst;

    public Company(String name, String country, String location, Date dateOfEst) {
        this.name = name;
        this.country = country;
        this.location = location;
        this.dateOfEst = dateOfEst;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateOfEst() {
        return dateOfEst;
    }

    public void setDateOfEst(Date dateOfEst) {
        this.dateOfEst = dateOfEst;
    }
}
