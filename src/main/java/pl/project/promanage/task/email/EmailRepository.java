package pl.project.promanage.task.email;

import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;

@Transactional
public interface EmailRepository extends TaskBaseRepository<Email> {
}
