package pl.project.promanage.user.worker.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.task.Task;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public List<Manager> getAllManagers(){
        List<Manager> managers = new ArrayList<>();

        managerRepository.findAll().forEach(managers::add);
        return managers;
    }

    public Manager getManager(Long id){
        return managerRepository.findById(id).orElse(null);
    }

    public void addManager(Manager manager){
        managerRepository.save(manager);
    }

    public void updateManager(Manager manager){
        managerRepository.save(manager);
    }

    public void deleteManager(Long id){
        managerRepository.deleteById(id);
    }
//
//    public List<Task> getHomeCardTasks(Long id) {
//        return managerRepository.getTopTasks(id);
//    }
}
