package pl.project.promanage.task.development;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;
import pl.project.promanage.user.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
@DiscriminatorValue("Development")
public class Development extends Task {

    @Nullable
    private String connectedTo;

    public Development(){}

    public Development(String name, float state, Timestamp deadline, Project myProject, User myUser, @Nullable String connectedTo, String description, float duration) {
        super(name, state, deadline, myProject, myUser, description, duration);
        this.connectedTo = connectedTo;
    }

    public String getConnectedTo() {
        return connectedTo;
    }

    public void setConnectedTo(String connectedTo) {
        this.connectedTo = connectedTo;
    }
}


