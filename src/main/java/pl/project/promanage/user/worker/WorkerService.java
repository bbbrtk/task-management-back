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
}
