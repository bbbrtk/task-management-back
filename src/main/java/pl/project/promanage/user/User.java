package pl.project.promanage.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.customer.Customer;
import pl.project.promanage.user.worker.developer.Developer;
import pl.project.promanage.user.worker.manager.Manager;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Manager.class, name = "Manager"),

        @JsonSubTypes.Type(value = Developer.class, name = "Developer"),

        @JsonSubTypes.Type(value = Customer.class, name = "Customer")}
)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Nullable
    @ManyToOne(cascade = CascadeType.MERGE)
    private Team myTeam;

    private String forename;

    private String email;

    @Column(insertable = false, updatable = false)
    private String dtype;

    public User(){}

    public User(String name) {
        this.name = name;
    }

    public User(String name, @Nullable Team myTeam, String forename, String email, String dtype) {
        this.name = name;
        this.myTeam = myTeam;
        this.forename = forename;
        this.email = email;
        this.dtype = dtype;
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
    public Team getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(@Nullable Team myTeam) {
        this.myTeam = myTeam;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }
}
