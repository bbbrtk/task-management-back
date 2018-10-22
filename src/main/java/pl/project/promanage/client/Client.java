package pl.project.promanage.client;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String NIP;

    private String description;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfEst;

    private float asset;


    public Client(String name, String NIP, String description, Date dateOfEst, float asset) {
        this.name = name;
        this.NIP = NIP;
        this.description = description;
        this.dateOfEst = dateOfEst;
        this.asset = asset;
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

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfEst() {
        return dateOfEst;
    }

    public void setDateOfEst(Date dateOfEst) {
        this.dateOfEst = dateOfEst;
    }

    public float getAsset() {
        return asset;
    }

    public void setAsset(float asset) {
        this.asset = asset;
    }
}
