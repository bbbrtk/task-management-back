package pl.project.promanage.task.development;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Development")
public class Development extends Task {

    @Nullable
    private String connectedTo;

    @Nullable
    private String description;

    public Development(){}

    public Development(String name, float state, Project myProject, String attachment, String connectedTo, String description) {
        super(name, state, myProject, attachment);
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


