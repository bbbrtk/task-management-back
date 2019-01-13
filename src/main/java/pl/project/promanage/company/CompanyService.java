package pl.project.promanage.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.team.Team;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies(){
        List<Company> clients = new ArrayList<>();

        companyRepository.findAll().forEach(clients::add);
        return clients;
    }

    public Company getCompany(Long id){
        return companyRepository.findById(id).orElse(null);
    }

    public List<Team> getTeams(Long id) {return companyRepository.getTeams(id);}

    public void addCompany(Company client){
        companyRepository.save(client);
    }

    public void updateCompany(Company client){
        companyRepository.save(client);
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }



}
