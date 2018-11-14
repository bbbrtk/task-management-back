package pl.project.promanage.user.worker;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface WorkerRepository extends WorkerBaseRepository<Worker> {


}
