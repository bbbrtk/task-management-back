package pl.project.promanage.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/companies")
    public List<Company> getAllProjects(){
        return companyService.getAllCompanies();
    }

    @RequestMapping("/companies/{id}")
    public Company getProject(@PathVariable Long id){
        return companyService.getCompany(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/companies/{id}")
    public void updateProject(@RequestBody Company company, @PathVariable Long id){
        companyService.updateCompany(company);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/companies")
    public void createProject(@RequestBody Company company){
        companyService.addCompany(company);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/companies/{id}")
    public void deleteProject(@PathVariable Long id){
        companyService.deleteCompany(id);
    }


}
