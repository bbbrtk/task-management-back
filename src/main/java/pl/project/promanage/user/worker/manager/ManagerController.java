package pl.project.promanage.user.worker.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managers")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<Manager> getAllManagers(){
        return managerService.getAllManagers();
    }

    @GetMapping("{id}")
    public Manager getManager(@PathVariable Long id){
        return managerService.getManager(id);
    }

    @PutMapping("{id}")
    public void updateManager(@RequestBody Manager manager, @PathVariable Long id){
        managerService.updateManager(manager);
    }

    @PostMapping
    public void createManager(@RequestBody Manager manager){
        managerService.addManager(manager);
    }

    @DeleteMapping("{id}")
    public void deleteManager(@PathVariable Long id){
        managerService.deleteManager(id);
    }
}
