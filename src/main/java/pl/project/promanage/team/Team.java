package pl.project.promanage.team;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import pl.project.promanage.company.Company;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Nullable
    @ManyToOne(cascade = CascadeType.ALL)
    private Company myCompany;

    private float capacity;

    public Team(String name, float capacity) {
        this.name = name;
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

    @Nullable
    public Company getMyCompany() {
        return myCompany;
    }

    public void setMyCompany(@Nullable Company myCompany) {
        this.myCompany = myCompany;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
}
