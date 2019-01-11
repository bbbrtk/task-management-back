package pl.project.promanage.task.testdriving;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;

import java.util.List;

@Transactional
public interface TestDrivingRepository extends TaskBaseRepository<TestDriving> {

    @Query("select t from TestDriving t")
    public List<TestDriving> getAllTestDrivings2();
}
