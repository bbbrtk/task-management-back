package pl.project.promanage.task.meeting;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;
import pl.project.promanage.task.email.Email;

import java.util.List;

@Transactional
public interface MeetingRepository extends TaskBaseRepository<Meeting> {

    @Query("select t from Meeting t")
    public List<Meeting> getAllMeetings2();
}
