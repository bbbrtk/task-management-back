package pl.project.promanage.user.worker.manager;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.task.Task;
import pl.project.promanage.user.worker.WorkerBaseRepository;

import java.util.ArrayList;
import java.util.List;

@Transactional
public interface ManagerRepository extends WorkerBaseRepository<Manager> {

//
//    @Query("SELECT t FROM Task t join t.myProject p join p.myManager m where m.id = :managerId order by t.deadline desc")
//    public List<Task> getTopTasks(@Param("managerId") Long managerId);


}
