package pl.project.promanage.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        List<Project> projects = new ArrayList<>();

        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    public Project getProject(Long id){
        return projectRepository.findById(id).orElse(null);
    }

    public void addProject(Project project){
        projectRepository.save(project);
    }

    public void updateProject(Project project){
        projectRepository.save(project);
    }

    public void deleteProject(Long id){
        projectRepository.deleteById(id);
    }
}
