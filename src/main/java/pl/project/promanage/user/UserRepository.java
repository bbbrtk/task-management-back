package pl.project.promanage.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.project.promanage.team.Team;

import java.util.List;
import java.util.Optional;

@Transactional
public interface UserRepository extends UserBaseRepository<User> {

    Optional<User> findByName(String name);

    @Query("SELECT t FROM Team t where t.id = :teamId")
    public Team getTeam(@Param("teamId") Long teamId);
}
