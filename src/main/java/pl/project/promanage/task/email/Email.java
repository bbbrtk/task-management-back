package pl.project.promanage.task.email;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Email")
public class Email extends Task {

    @Nullable
    private String topic;

    @Nullable
    private String text;

    public Email(){}

    public Email(String name, float state, Project myProject, String attachment, String topic, String text) {
        super(name, state, myProject, attachment);
        this.topic = topic;
        this.text = text;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
