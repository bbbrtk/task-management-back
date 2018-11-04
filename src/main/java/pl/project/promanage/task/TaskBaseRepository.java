package pl.project.promanage.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface TaskBaseRepository<T extends Task>
extends CrudRepository<T, Long> {

    public T findByName(String name);
}
