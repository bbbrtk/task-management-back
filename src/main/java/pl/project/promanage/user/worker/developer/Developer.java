package pl.project.promanage.user.customer;

import pl.project.promanage.client.Client;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends User {

    private String type;

    private String info;

    private Client myClient;

    public Customer(String name, Team myTeam, String type, String info, Client myClient) {
        super(name, myTeam);
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

    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(Client myClient) {
        this.myClient = myClient;
    }
}
