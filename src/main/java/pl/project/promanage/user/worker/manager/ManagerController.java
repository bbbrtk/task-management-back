package pl.project.promanage.user.worker.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.task.Task;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ManagerController {

    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/managers")
    public List<Manager> getAllManagers(){
        return managerService.getAllManagers();
    }

    @GetMapping("/managers/{id}")
    public Manager getManager(@PathVariable Long id){
        return managerService.getManager(id);
    }

    @PutMapping("/managers/{id}")
    public void updateManager(@RequestBody Manager manager, @PathVariable Long id){
        managerService.updateManager(manager);
    }

    @GetMapping("/managers/{id}/home-card")
    public List<Task> getHomeCardTasks(@PathVariable Long id){
        return managerService.getHomeCardTasks(id);
    }

    @PostMapping("/managers")
    public void createManager(@RequestBody Manager manager){
        managerService.addManager(manager);
    }

    @DeleteMapping("/managers/{id}")
    public void deleteManager(@PathVariable Long id){
        managerService.deleteManager(id);
    }
}
