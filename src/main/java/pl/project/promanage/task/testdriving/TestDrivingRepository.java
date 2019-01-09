package pl.project.promanage.task.testdriving;

import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;

@Transactional
public interface TestDrivingRepository extends TaskBaseRepository<TestDriving> {
}
