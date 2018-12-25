package pl.project.promanage.user;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface UserRepository extends UserBaseRepository<User> {

    Optional<Object> findByName(String name);
}
