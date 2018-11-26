package pl.project.promanage.user.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getAllWorkers(){
        List<Worker> users = new ArrayList<>();

        workerRepository.findAll().forEach(users::add);
        return users;
    }

    public Worker getWorker(Long id){
        return workerRepository.findById(id).orElse(null);
    }

    public void addWorker(Worker worker){
        workerRepository.save(worker);
    }

    public void updateWorker(Worker worker){
        workerRepository.save(worker);
    }

    public void deleteWorker(Long id){
        workerRepository.deleteById(id);
    }

}
