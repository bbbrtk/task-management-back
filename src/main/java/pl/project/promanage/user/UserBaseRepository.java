package pl.project.promanage.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface UserBaseRepository<T extends User>
        extends CrudRepository<T, Long> {

}
