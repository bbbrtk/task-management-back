package pl.project.promanage.user.worker;

import pl.project.promanage.task.Task;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.User;

import javax.persistence.Entity;

@Entity
public class Worker extends User {

    private String position;

    private float experience;

    private Task myTask;
    // or
    // private List<Task> myTasks;

    public Worker(String name, Team myTeam, String position, float experience, Task myTask) {
        super(name, myTeam);
        this.position = position;
        this.experience = experience;
        this.myTask = myTask;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Task getMyTask() {
        return myTask;
    }

    public void setMyTask(Task myTask) {
        this.myTask = myTask;
    }
}
