package pl.project.promanage.project;

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
    @ManyToOne(cascade = CascadeType.ALL)
    private Client myClient;

    @Nullable
    @ManyToOne
    private Manager myManager;

    @Nullable
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "projects_workers",
            joinColumns = { @JoinColumn(name = "project_id") },
            inverseJoinColumns = { @JoinColumn(name = "worker_id") })
    private Set<Worker> workers = new HashSet<>();


    public  Project(){};

    public Project(String name, float duration, @Nullable Client myClient, @Nullable Manager myManager, @Nullable Set<Worker> workers) {
        this.name = name;
        this.duration = duration;
        this.myClient = myClient;
        this.myManager = myManager;
        this.workers = workers;
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

    @Nullable
    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(@Nullable Client myClient) {
        this.myClient = myClient;
    }

    @Nullable
    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(@Nullable Set<Worker> workers) {
        this.workers = workers;
    }

    public Manager getMyManager() {
        return myManager;
    }

    public void setMyManager(Manager myManager) {
        this.myManager = myManager;
    }
}
