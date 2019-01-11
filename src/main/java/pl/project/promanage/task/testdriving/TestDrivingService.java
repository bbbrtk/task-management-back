package pl.project.promanage.task.testdriving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.task.email.Email;
import pl.project.promanage.task.email.EmailRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestDrivingService {

    @Autowired
    private TestDrivingRepository testDrivingRepository;

    public List<TestDriving> getAllTestDrivings(){
        List<TestDriving> dev = new ArrayList<>();
        testDrivingRepository.findAll().forEach(dev::add);
        return dev;
    }

    public List<TestDriving> getAllTestDrivings2(){
        return testDrivingRepository.getAllTestDrivings2();
    }

    public TestDriving getTestDrivings(Long id){
        return testDrivingRepository.findById(id).orElse(null);
    }

    public void addTestDrivings(TestDriving dev){
        testDrivingRepository.save(dev);
    }

    public void updateTestDrivings(TestDriving dev){
        testDrivingRepository.save(dev);
    }

    public void deleteTestDrivings(Long id){
        testDrivingRepository.deleteById(id);
    }
}
