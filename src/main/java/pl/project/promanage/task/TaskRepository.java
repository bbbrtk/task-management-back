package pl.project.promanage.task;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TaskRepository extends TaskBaseRepository<Task> {

    //@Query("select t from Task t where (t.myProject = (select p from Project p where p.id = :projectId) )")
    @Query("select t from Task t")
    public List<Task> getAllTasksForProject(@Param("projectId") Long projectId);

    @Query("select t from Task t")
    public List<Task> getAllTasks2();
}
