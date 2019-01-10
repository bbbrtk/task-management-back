package pl.project.promanage.task.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.task.development.Development;
import pl.project.promanage.task.development.DevelopmentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public List<Email> getAllEmails(){
        List<Email> dev = new ArrayList<>();
        emailRepository.findAll().forEach(dev::add);
        return dev;
    }

    public List<Email> getAllEmails2(){
        return emailRepository.getAllEmails2();
    }

    public Email getEmail(Long id){
        return emailRepository.findById(id).orElse(null);
    }

    public void addEmail(Email dev){
        emailRepository.save(dev);
    }

    public void updateEmail(Email dev){
        emailRepository.save(dev);
    }

    public void deleteEmail(Long id){
        emailRepository.deleteById(id);
    }
}
