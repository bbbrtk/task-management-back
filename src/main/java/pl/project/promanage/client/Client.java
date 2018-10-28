package pl.project.promanage.client;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CLIENTS")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< Updated upstream
    private String id;
=======
    @Column(name="id")
    private Long id;
>>>>>>> Stashed changes

    @Column(name="name")
    private String name;

    @Column(name="nip")
    private String NIP;

    @Column(name="desc")
    private String description;

    @Column(name="date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfEst;

    @Column(name="asset")
    private float asset;


    public Client(String name, String NIP, String description, Date dateOfEst, float asset) {
        this.name = name;
        this.NIP = NIP;
        this.description = description;
        this.dateOfEst = dateOfEst;
        this.asset = asset;
    }

    public String getId() {
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
