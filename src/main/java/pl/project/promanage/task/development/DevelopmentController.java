package pl.project.promanage.task.development;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.task.Task;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class DevelopmentController {


    @Autowired
    private DevelopmentService developmentService;

    @GetMapping("/developments")
    public List<Development> getAllDevelopments(){
        return developmentService.getAllDevelopments();
    }

    @GetMapping("/project-developments")
    public List<Development> getAllDevelopments2(){
        return developmentService.getAllDevelopments2();
    }

    @GetMapping("/developments/{id}")
    public Development getDevelopment(@PathVariable Long id){
        return developmentService.getDevelopment(id);
    }

    @PutMapping("/developments/{id}")
    public void updateDevelopment(@RequestBody Development dev, @PathVariable Long id){
        developmentService.updateDevelopment(dev);
    }

    @PostMapping("/developments")
    public void createDevelopment(@RequestBody Development dev){
        developmentService.addDevelopment(dev);
    }

    @DeleteMapping("/developments/{id}")
    public void deleteDevelopment(@PathVariable Long id){
        developmentService.deleteDevelopment(id);
    }

}
