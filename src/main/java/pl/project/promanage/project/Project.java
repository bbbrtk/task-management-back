package pl.project.promanage.project;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.lang.Nullable;
import pl.project.promanage.client.Client;
import pl.project.promanage.user.worker.Worker;
import pl.project.promanage.user.worker.manager.Manager;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private float duration;

    @Nullable
    @ManyToOne(cascade = CascadeType.MERGE)
    private Client myClient;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "projects")
//    private Set<Worker> workers = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "projects_workers", joinColumns = @JoinColumn(name = "worker_id"))
    @Column(insertable = false, updatable = false, name = "project_id")
    @Fetch(FetchMode.SELECT)
    private Set<Long> workerIds;


    public  Project(){};

    public Project(String name, float duration, Client myClient) {
        this.name = name;
        this.duration = duration;
        this.myClient = myClient;
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

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(Client myClient) {
        this.myClient = myClient;
    }

    public Set<Long> getWorkerIds() {
        return workerIds;
    }

    public void setWorkerIds(Set<Long> workerIds) {
        this.workerIds = workerIds;
    }
}
