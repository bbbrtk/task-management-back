package pl.project.promanage.project;

import pl.project.promanage.client.Client;
import pl.project.promanage.user.worker.Worker;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private float duration;

    @ManyToOne
    private Client myClient;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "projects_workers", joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "worker_id", referencedColumnName = "id"))
    private Set<Worker> workers;

    public Project(String name, float duration, Client myClient, Set<Worker> workers) {
        this.name = name;
        this.duration = duration;
        this.myClient = myClient;
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

    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(Client myClient) {
        this.myClient = myClient;
    }

    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
    }
}
