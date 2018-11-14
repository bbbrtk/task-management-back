package pl.project.promanage.user.worker;

import org.springframework.data.repository.CrudRepository;

public interface WorkerBaseRepository<T extends Worker>
        extends CrudRepository<T, Long> {


}
