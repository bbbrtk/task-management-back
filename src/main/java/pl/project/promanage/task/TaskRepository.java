package pl.project.promanage.task;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TaskRepository extends TaskBaseRepository<Task> {
}
