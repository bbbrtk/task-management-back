package pl.project.promanage.task.meeting;

import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meeting extends Task {

    private String place;

    private String topic;

    public Meeting(String name, float state, Project myProject, String attachment, String place, String topic) {
        super(name, state, myProject, attachment);
        this.place = place;
        this.topic = topic;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
