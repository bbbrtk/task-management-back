package pl.project.promanage.task.development;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.Task;
import pl.project.promanage.task.TaskBaseRepository;

import java.util.List;

@Transactional
public interface DevelopmentRepository extends TaskBaseRepository<Development> {

    @Query("select t from Development t")
    public List<Development> getAllTDevelopments2();
}

