package pl.project.promanage.user.worker.manager;

import pl.project.promanage.project.Project;
import pl.project.promanage.task.Task;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.worker.Worker;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Set;

@Entity
@DiscriminatorValue("Manager")
public class Manager extends Worker {

    private String certificate;

    public Manager(){};

    public Manager(String name, String position, float experience, Team myTeam, Set<Project> projects, String certificate) {
        super(name, position, experience, myTeam, projects);
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
