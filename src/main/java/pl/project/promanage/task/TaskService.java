package pl.project.promanage.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.project.Project;
import pl.project.promanage.project.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        List<Task> task = new ArrayList<>();

        taskRepository.findAll().forEach(task::add);
        return task;
    }

    public List<Task> getAllTasks2(){
        return taskRepository.getAllTasks2();
    }

    public List<Task> getAllTasksForProject(long projectId){
        return taskRepository.getAllTasksForProject(projectId);
    }

    public Task getTask(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public void addTask(Task task){
        taskRepository.save(task);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
