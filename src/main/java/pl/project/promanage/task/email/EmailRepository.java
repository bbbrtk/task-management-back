package pl.project.promanage.task.email;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.TaskBaseRepository;
import pl.project.promanage.task.development.Development;

import java.util.List;

@Transactional
public interface EmailRepository extends TaskBaseRepository<Email> {

    @Query("select t from Email t")
    public List<Email> getAllEmails2();
}