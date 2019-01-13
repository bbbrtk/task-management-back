package pl.project.promanage.company;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.project.promanage.team.Team;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    @Query("SELECT t FROM Team t where t.myCompany.id = :companyId")
    //@Query("SELECT t FROM Team t")
    public List<Team> getTeams(@Param("companyId") Long companyId);
}
