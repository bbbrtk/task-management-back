package pl.project.promanage.task;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Task, Long> {

}
