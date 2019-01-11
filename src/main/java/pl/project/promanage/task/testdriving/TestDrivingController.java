package pl.project.promanage.task.testdriving;


import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.task.email.Email;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TestDrivingController {


    @Autowired
    private TestDrivingService testDrivingService;

    @GetMapping("/testdrivings")
    public List<TestDriving> getAllTestDrivings(){
        return testDrivingService.getAllTestDrivings();
    }

    @GetMapping("/project-testdrivings")
    public List<TestDriving> getAllTestDrivings2(){
        return testDrivingService.getAllTestDrivings2();
    }

    @GetMapping("/testdrivings/{id}")
    public TestDriving getTestDrivings(@PathVariable Long id){
        return testDrivingService.getTestDrivings(id);
    }

    @PutMapping("/testdrivings/{id}")
    public void updateTestDrivings(@RequestBody TestDriving dev, @PathVariable Long id){
        testDrivingService.updateTestDrivings(dev);
    }

    @PostMapping("/testdrivings")
    public void createTestDrivings(@RequestBody TestDriving dev){
        testDrivingService.addTestDrivings(dev);
    }

    @DeleteMapping("/testdrivings/{id}")
    public void deleteTestDrivings(@PathVariable long id){
        testDrivingService.deleteTestDrivings(id);
    }

}
