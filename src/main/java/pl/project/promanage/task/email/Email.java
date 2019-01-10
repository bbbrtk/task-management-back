package pl.project.promanage.task.email;

import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;

import javax.persistence.Entity;

@Entity
public class Email extends Task {

    private String topic;

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
