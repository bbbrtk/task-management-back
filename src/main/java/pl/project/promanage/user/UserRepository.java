package pl.project.promanage.user;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends UserBaseRepository<User> {

}
