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

    @Nullable
    private String description;

    public Development(){}

    public Development(String name, float state, String attachment, Timestamp deadline, Project myProject, User myUser, @Nullable String connectedTo, @Nullable String description) {
        super(name, state, attachment, deadline, myProject, myUser);
        this.connectedTo = connectedTo;
        this.description = description;
    }

    public String getConnectedTo() {
        return connectedTo;
    }

    public void setConnectedTo(String connectedTo) {
        this.connectedTo = connectedTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


