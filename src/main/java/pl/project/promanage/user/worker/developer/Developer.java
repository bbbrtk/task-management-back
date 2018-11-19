package pl.project.promanage.user.worker.developer;

import pl.project.promanage.project.Project;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.worker.Worker;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Set;

@Entity
@DiscriminatorValue("Developer")
public class Developer extends Worker {

    private String type;

    private String info;

    private Integer rating;

    public Developer(){};

    public Developer(String name, String position, float experience, Team myTeam, Set<Project> projects, String type, String info) {
        super(name, position, experience, myTeam, projects);
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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
