package pl.project.promanage.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @RequestMapping("/clients/{id}")
    public Client getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/clients/{id}")
    public void updateClient(@RequestBody Client client, @PathVariable Long id){
        clientService.updateClient(client);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/clients")
    public void createClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/clients/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }

}
