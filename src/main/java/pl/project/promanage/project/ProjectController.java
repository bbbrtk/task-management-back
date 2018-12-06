package pl.project.promanage.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @GetMapping("/projects/{id}")
    public Project getProject(@PathVariable Long id){
        return projectService.getProject(id);
    }

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
