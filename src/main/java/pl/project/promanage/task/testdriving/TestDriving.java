package pl.project.promanage.task.testdriving;

import org.springframework.lang.Nullable;
import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("TestDriving")
public class TestDriving extends Task {

    @Nullable
    private float testScore;

    @Nullable
    private String description;

    public TestDriving(){}

    public TestDriving(String name, float state, Project myProject, String attachment, float testScore, String description) {
        super(name, state, myProject, attachment);
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
