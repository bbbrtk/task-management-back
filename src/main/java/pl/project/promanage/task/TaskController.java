package pl.project.promanage.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.project.Project;
import pl.project.promanage.project.ProjectService;

import java.util.List;

@RestController
public class TaskController {


    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable Long id){
        return taskService.getTask(id);
    }

    @PutMapping("/tasks/{id}")
    public void updateTask(@RequestBody Task task, @PathVariable Long id){
        taskService.updateTask(task);
    }

    @PostMapping("/tasks")
    public void createTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }

}
