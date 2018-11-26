package pl.project.promanage.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @PutMapping("/clients/{id}")
    public void updateClient(@RequestBody Client client, @PathVariable Long id){
        clientService.updateClient(client);
    }

    @PostMapping("/clients")
    public void createClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }

}
