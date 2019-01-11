package pl.project.promanage.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.user.worker.Worker;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ProjectController {


    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @GetMapping("projects/user-{uId}")
    public List<Project> getUserProjects(@PathVariable String uId){
        return projectService.getUserProjects(Long.parseLong(uId));
    }

    @GetMapping("projects/client-{uId}")
    public List<Project> getClientProjects(@PathVariable String uId){
        return projectService.getClientProjects(Long.parseLong(uId));
    }

//    @GetMapping("projects/worker-{uId}")
//    public List<Worker> getWorkerProjects(@PathVariable String uId){
//        return projectService.getWorkerProjects(Long.parseLong(uId));
//    }

    @GetMapping("/projects/{id}")
    public Project getProject(@PathVariable Long id){return projectService.getProject(id);}

    @PutMapping("/projects/{id}")
    public void updateProject(@RequestBody Project project, @PathVariable Long id){
        projectService.updateProject(project);
    }

    @PostMapping("/projects")
    public void createProject(@RequestBody Project project){
        projectService.addProject(project);
    }

    @DeleteMapping("/projects/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
    }

}
