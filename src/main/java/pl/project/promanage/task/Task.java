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

    private String attachment;

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

    public Task(String name, float state, String attachment, Timestamp deadline, @Nullable Project myProject, @Nullable User myUser) {
        this.name = name;
        this.state = state;
        this.attachment = attachment;
        this.deadline = deadline;
        this.myProject = myProject;
        this.myUser = myUser;
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

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
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
}
