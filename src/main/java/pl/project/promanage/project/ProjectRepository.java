package pl.project.promanage.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.user.worker.Worker;

import java.util.List;

@Transactional
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Query("select p from Project p where p.myManager.id = :userId")
    List<Project> getUserProjects(@Param("userId") Long userId);

    @Query("select p from Project p where p.myClient.id = :userId")
    List<Project> getClientProjects(@Param("userId") Long userId);

//    @Query("select w from Worker w where w.id = :userId")
//    List<Worker> getWorkerProjects(@Param("userId") Long userId);

}
