package pl.project.promanage.user;

import org.springframework.format.annotation.DateTimeFormat;
import pl.project.promanage.team.Team;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public User(){}

    public User(String name) {
        this.name = name;
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
}
