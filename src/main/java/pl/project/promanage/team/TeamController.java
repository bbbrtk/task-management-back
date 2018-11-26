package pl.project.promanage.team;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getAllProjects(){
        return teamService.getAllTeams();
    }

    @RequestMapping("/teams/{id}")
    public Team getProject(@PathVariable Long id){
        return teamService.getTeam(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/teams/{id}")
    public void updateProject(@RequestBody Team team, @PathVariable Long id){
        teamService.updateTeam(team);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teams")
    public void createProject(@RequestBody Team team){
        teamService.addTeam(team);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teams/{id}")
    public void deleteProject(@PathVariable Long id){
        teamService.deleteTeam(id);
    }


}
