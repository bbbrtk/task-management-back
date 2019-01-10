package pl.project.promanage.task.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.task.Task;
import pl.project.promanage.task.TaskRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DevelopmentService {

    @Autowired
    private DevelopmentRepository developmentRepository;

    public List<Development> getAllDevelopments(){
        List<Development> dev = new ArrayList<>();
        developmentRepository.findAll().forEach(dev::add);
        return dev;
    }

    public List<Development> getAllDevelopments2(){
        return developmentRepository.getAllTDevelopments2();
    }

    public Development getDevelopment(Long id){
        return developmentRepository.findById(id).orElse(null);
    }

    public void addDevelopment(Development dev){
        developmentRepository.save(dev);
    }

    public void updateDevelopment(Development dev){
        developmentRepository.save(dev);
    }

    public void deleteDevelopment(Long id){
        developmentRepository.deleteById(id);
    }
}
