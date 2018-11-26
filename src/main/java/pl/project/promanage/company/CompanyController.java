package pl.project.promanage.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @GetMapping("/companies/{id}")
    public Company getCompany(@PathVariable Long id){
        return companyService.getCompany(id);
    }

    @PutMapping("/companies/{id}")
    public void updateCompany(@RequestBody Company company, @PathVariable Long id){
        companyService.updateCompany(company);
    }

    @PostMapping("/companies")
    public void createCompany(@RequestBody Company company){
        companyService.addCompany(company);
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompany(@PathVariable Long id){
        companyService.deleteCompany(id);
    }


}
