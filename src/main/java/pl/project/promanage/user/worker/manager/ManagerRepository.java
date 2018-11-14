package pl.project.promanage.user.worker.manager;

import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.user.worker.WorkerBaseRepository;

@Transactional
public interface ManagerRepository extends WorkerBaseRepository<Manager> {
}
