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


    public TestDriving(){}

    public TestDriving(String name, float state, Timestamp deadline, Project myProject, User myUser, float testScore, String description, float duration) {
        super(name, state, deadline, myProject, myUser, description, duration);
        this.testScore = testScore;
    }

    public float getTestScore() {
        return testScore;
    }

    public void setTestScore(float testScore) {
        this.testScore = testScore;
    }

}
