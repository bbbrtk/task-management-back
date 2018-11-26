package pl.project.promanage.user.worker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/workers")
    public List<Worker> getAllWarker(){
        return workerService.getAllWorkers();
    }

    @GetMapping("/workers/{id}")
    public Worker getWorker(@PathVariable Long id){
        return workerService.getWorker(id);
    }

    @PutMapping("/workers/{id}")
    public void updateWorker(@RequestBody Worker worker, @PathVariable Long id){
        workerService.updateWorker(worker);
    }

    @PostMapping("/workers")
    public void createWorker(@RequestBody Worker worker){
        workerService.addWorker(worker);
    }

    @DeleteMapping("/workers/{id}")
    public void deleteWorker(@PathVariable Long id){
        workerService.deleteWorker(id);
    }

}
