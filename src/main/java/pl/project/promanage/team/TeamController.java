package pl.project.promanage.team;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/teams")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id){
        return teamService.getTeam(id);
    }

    @PutMapping("/teams/{id}")
    public void updateTeam(@RequestBody Team team, @PathVariable Long id){
        teamService.updateTeam(team);
    }

    @PostMapping("/teams")
    public void createTeam(@RequestBody Team team){
        teamService.addTeam(team);
    }

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable Long id){
        teamService.deleteTeam(id);
    }


}
