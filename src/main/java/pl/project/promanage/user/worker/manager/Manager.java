package pl.project.promanage.user.worker.developer;

import pl.project.promanage.client.Client;
import pl.project.promanage.task.Task;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.User;
import pl.project.promanage.user.worker.Worker;

import javax.persistence.Entity;

@Entity
public class Developer extends Worker {

    private String type;

    private String info;

    public Developer(String name, Team myTeam, String position,
                     float experience, Task myTask, String type, String info) {
        super(name, myTeam, position, experience, myTask);
        this.type = type;
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
