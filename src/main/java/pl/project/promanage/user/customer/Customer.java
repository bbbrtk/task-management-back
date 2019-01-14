package pl.project.promanage.user.customer;

import org.springframework.lang.Nullable;
import pl.project.promanage.client.Client;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.User;

import javax.persistence.*;
import javax.validation.constraints.Null;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends User {

    private String type;

    private String info;

    @Nullable
    @ManyToOne(cascade = CascadeType.MERGE)
    private Client myClient;

    public Customer(){};

    public Customer(String name, String type, String info, Client myClient) {
        super(name);
        this.type = type;
        this.info = info;
        this.myClient = myClient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Nullable
    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(@Nullable Client myClient) {
        this.myClient = myClient;
    }
}
