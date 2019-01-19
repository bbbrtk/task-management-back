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

    public Meeting(){}

    public Meeting(String name, float state,  Timestamp deadline, Project myProject, User myUser, @Nullable String place, String description, float duration) {
        super(name, state,deadline, myProject, myUser, description, duration);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
