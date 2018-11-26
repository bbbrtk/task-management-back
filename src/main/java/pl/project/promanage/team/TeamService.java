package pl.project.promanage.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams(){
        List<Team> team = new ArrayList<>();

        teamRepository.findAll().forEach(team::add);
        return team;
    }

    public Team getTeam(Long id){
        return teamRepository.findById(id).orElse(null);
    }

    public void addTeam(Team team){
        teamRepository.save(team);
    }

    public void updateTeam(Team team){
        teamRepository.save(team);
    }

    public void deleteTeam(Long id){
        teamRepository.deleteById(id);
    }


}
