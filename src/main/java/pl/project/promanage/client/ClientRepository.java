package pl.project.promanage.client;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.project.promanage.task.Task;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
