package pl.project.promanage.task.meeting;

import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;

@Transactional
public interface MeetingRepository extends TaskBaseRepository<Meeting> {
}
