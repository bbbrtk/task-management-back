package pl.project.promanage.user.worker.developer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.user.worker.manager.Manager;
import pl.project.promanage.user.worker.manager.ManagerService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @GetMapping("/developers")
    public List<Developer> getAllDevelopers(){
        return developerService.getAllDevelopers();
    }

    @GetMapping("/developers/{id}")
    public Developer getDeveloper(@PathVariable Long id){
        return developerService.getDeveloper(id);
    }

    @PutMapping("/developers/{id}")
    public void updateDeveloper(@RequestBody Developer manager, @PathVariable Long id){
        developerService.updateDeveloper(manager);
    }

    @PostMapping("/developers")
    public void createDeveloper(@RequestBody Developer manager){
        developerService.addDeveloper(manager);
    }

    @DeleteMapping("/developers/{id}")
    public void deleteDeveloper(@PathVariable Long id){
        developerService.deleteDeveloper(id);
    }
}
