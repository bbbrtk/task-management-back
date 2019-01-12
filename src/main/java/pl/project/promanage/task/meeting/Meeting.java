package pl.project.promanage.task.meeting;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;
import pl.project.promanage.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@DiscriminatorValue("Meeting")
public class Meeting extends Task {

    @Nullable
    private String place;
    @Nullable
    private String topic;

    public Meeting(){}

    public Meeting(String name, float state, String attachment, Timestamp deadline, Project myProject, User myUser, @Nullable String place, @Nullable String topic) {
        super(name, state, attachment, deadline, myProject, myUser);
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
