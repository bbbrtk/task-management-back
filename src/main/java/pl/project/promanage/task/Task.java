package pl.project.promanage.task;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.user.User;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Inheritance
@DiscriminatorColumn(name = "dtype")
@Table(name = "tasks")
public abstract class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private float state;

    private float duration;

    private String description;

    private Timestamp deadline;

    @Nullable
    @ManyToOne(cascade = CascadeType.MERGE)
    private Project myProject;

    @Nullable
    @ManyToOne(cascade = CascadeType.MERGE)
    private User myUser;

    public Task(){}

//    public Task(String name, float state, Project myProject, String attachment) {
//        this.name = name;
//        this.state = state;
//        this.myProject = myProject;
//        this.attachment = attachment;
//    }

    public Task(String name, float state, Timestamp deadline, Project myProject, User myUser, String description, float duration) {
        this.name = name;
        this.state = state;
        this.deadline = deadline;
        this.myProject = myProject;
        this.myUser = myUser;
        this.description = description;
        this.duration = duration;
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

    public float getState() {
        return state;
    }

    public void setState(float state) {
        this.state = state;
    }

    @Nullable
    public Project getMyProject() {
        return myProject;
    }

    public void setMyProject(@Nullable Project myProject) {
        this.myProject = myProject;
    }

    @Nullable
    public User getMyUser() {
        return myUser;
    }

    public void setMyUser(@Nullable User myUser) {
        this.myUser = myUser;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
