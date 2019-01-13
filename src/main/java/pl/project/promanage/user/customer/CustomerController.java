package pl.project.promanage.user.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.project.promanage.task.Task;
import pl.project.promanage.user.customer.Customer;
import pl.project.promanage.user.customer.CustomerService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    @PutMapping("/customers/{id}") //TODO fix it !! check current doc to put requests
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long id){
        customerService.updateCustomer(customer);
    }

    @GetMapping("/customers/client/{id}/home-card")
    public List<Task> getHomeCardTasks(@PathVariable Long id){
        return customerService.getHomeCardTasks(id);
    }

    @PostMapping("/customers")
    public void createCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }
}
