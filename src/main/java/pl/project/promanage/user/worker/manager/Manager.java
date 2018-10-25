package pl.project.promanage.user.worker.manager;

import pl.project.promanage.task.Task;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.worker.Worker;

import javax.persistence.Entity;

@Entity
public class Manager extends Worker {

    private String certificate;

    public Manager(String name, Team myTeam, String position, float experience, Task myTask, String certificate) {
        super(name, myTeam, position, experience, myTask);
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
