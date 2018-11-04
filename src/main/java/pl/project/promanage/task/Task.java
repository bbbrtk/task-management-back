package pl.project.promanage.task;

import pl.project.promanage.project.Project;
import pl.project.promanage.user.User;

import javax.persistence.*;


@Entity
@Inheritance
@DiscriminatorColumn(name = "task_type")
@Table(name = "tasks")
public abstract class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private float state;

    private String attachment;



    @ManyToOne
    private Project myProject;

    @ManyToOne
    private User myUser;

    public Task(String name, float state, Project myProject, String attachment) {
        this.name = name;
        this.state = state;
        this.myProject = myProject;
        this.attachment = attachment;
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

    public Project getMyProject() {
        return myProject;
    }

    public void setMyProject(Project myProject) {
        this.myProject = myProject;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public User getMyUser() {
        return myUser;
    }

    public void setMyUser(User myUser) {
        this.myUser = myUser;
    }
}
