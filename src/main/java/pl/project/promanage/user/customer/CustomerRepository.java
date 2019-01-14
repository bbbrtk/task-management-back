package pl.project.promanage.user.customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.project.promanage.task.Task;
import pl.project.promanage.client.Client;
import pl.project.promanage.user.UserBaseRepository;

import java.util.List;

public interface CustomerRepository extends UserBaseRepository<Customer> {

    @Query("SELECT t FROM Task t join t.myProject p join p.myClient c where c.id = :managerId order by t.deadline desc")
    public List<Task> getProjectTasks(@Param("managerId") Long managerId);
}
