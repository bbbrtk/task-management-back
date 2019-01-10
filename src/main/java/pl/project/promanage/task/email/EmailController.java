package pl.project.promanage.task.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.task.development.Development;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class EmailController {


    @Autowired
    private EmailService emailService;

    @GetMapping("/emails")
    public List<Email> getAllEmails(){
        return emailService.getAllEmails();
    }

    @GetMapping("/project-emails")
    public List<Email> getAllEmails2(){
        return emailService.getAllEmails2();
    }

    @GetMapping("/emails/{id}")
    public Email getEmail(@PathVariable Long id){
        return emailService.getEmail(id);
    }

    @PutMapping("/emails/{id}")
    public void updateEmail(@RequestBody Email dev, @PathVariable Long id){
        emailService.updateEmail(dev);
    }

    @PostMapping("/emails")
    public void createEmail(@RequestBody Email dev){
        emailService.addEmail(dev);
    }

    @DeleteMapping("/emails/{id}")
    public void deleteEmail(@PathVariable Long id){
        emailService.deleteEmail(id);
    }

}
