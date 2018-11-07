package pl.project.promanage.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @RequestMapping("/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @RequestMapping("/projects/{id}")
    public Project getProject(@PathVariable Long id){
        return projectService.getProject(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/projects/{id}")
    public void updateProject(@RequestBody Project project, @PathVariable Long id){
        projectService.updateProject(project);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public void createProject(@RequestBody Project project){
        projectService.addProject(project);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
    }

}
