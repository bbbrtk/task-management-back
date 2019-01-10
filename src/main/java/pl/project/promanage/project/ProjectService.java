package pl.project.promanage.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.user.worker.Worker;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects(){
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    public Project getProject(Long id){
        return projectRepository.findById(id).orElse(null);
    }

    public List<Project> getUserProjects(long uId) { return projectRepository.getUserProjects(uId); }

    public List<Project> getClientProjects(long uId) { return projectRepository.getClientProjects(uId); }

//    public List<Worker> getWorkerProjects(long uId) { return projectRepository.getWorkerProjects(uId); }

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
