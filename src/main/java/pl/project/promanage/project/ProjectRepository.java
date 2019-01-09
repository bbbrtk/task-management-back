package pl.project.promanage.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Query("select p from Project p where p.myManager.id = :userId")
    List<Project> getUserProjects(@Param("userId") Long userId);
}
