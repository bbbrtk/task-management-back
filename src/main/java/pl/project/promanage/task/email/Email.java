package pl.project.promanage.task.email;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;
import pl.project.promanage.user.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
@DiscriminatorValue("Email")
public class Email extends Task {

    private String mailTo;

    public Email(){}

    public Email(String name, float state,  Timestamp deadline, Project myProject, User myUser, String mailTo, String description, float duration) {
        super(name, state, deadline, myProject, myUser, description, duration);
        this.mailTo = mailTo;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }
}
