package pl.project.promanage.task.testdriving;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;
import pl.project.promanage.user.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@DiscriminatorValue("TestDriving")
@Table(name="testdrivings")
public class TestDriving extends Task {

    @Nullable
    private float testScore;

    @Nullable
    private String description;

    public TestDriving(){}

    public TestDriving(String name, float state, String attachment, Timestamp deadline, Project myProject, User myUser, float testScore, @Nullable String description) {
        super(name, state, attachment, deadline, myProject, myUser);
        this.testScore = testScore;
        this.description = description;
    }

    public float getTestScore() {
        return testScore;
    }

    public void setTestScore(float testScore) {
        this.testScore = testScore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
