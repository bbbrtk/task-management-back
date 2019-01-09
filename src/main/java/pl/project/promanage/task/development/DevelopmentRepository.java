package pl.project.promanage.task.development;

import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;

@Transactional
public interface DevelopmentRepository extends TaskBaseRepository<Development> {
}
