package pl.project.promanage.user.worker;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@DiscriminatorValue("Worker")
@DiscriminatorColumn(name = "wtype")
public abstract class Worker extends User {

    private String position;

    @Nullable
    private float experience;

    // connection in class Task
    // private ArrayList<Task> myTasks;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
//                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "workers")
    private Set<Project> projects;

    @Column(insertable = false, updatable = false)
    private String wtype;

    public Worker(){};

    public Worker(String name, String position, float experience, Team myTeam, Set<Project> projects) {
        super(name);
        this.position = position;
        this.experience = experience;
        this.projects = projects;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Nullable
    public float getExperience() {
        return experience;
    }

    public void setExperience(@Nullable float experience) {
        this.experience = experience;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
