package pl.project.promanage.user.worker.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.user.worker.manager.Manager;
import pl.project.promanage.user.worker.manager.ManagerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    public List<Developer> getAllDevelopers(){
        List<Developer> developer = new ArrayList<>();

        developerRepository.findAll().forEach(developer::add);
        return developer;
    }

    public Developer getDeveloper(Long id){
        return developerRepository.findById(id).orElse(null);
    }

    public void addDeveloper(Developer developer){
        developerRepository.save(developer);
    }

    public void updateDeveloper(Developer developer){
        developerRepository.save(developer);
    }

    public void deleteDeveloper(Long id){
        developerRepository.deleteById(id);
    }

}
