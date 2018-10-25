package pl.project.promanage.team;

import org.springframework.format.annotation.DateTimeFormat;
import pl.project.promanage.company.Company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Company myCompany;

    private float capacity;

    public Team(String name, Company myCompany, float capacity) {
        this.name = name;
        this.myCompany = myCompany;
        this.capacity = capacity;
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

    public Company getMyCompany() {
        return myCompany;
    }

    public void setMyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
}
