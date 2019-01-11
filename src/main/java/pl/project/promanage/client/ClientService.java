package pl.project.promanage.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();

        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    public Client getClient(Long id){
        return clientRepository.findById(id).orElse(null);
    }

    public void addClient(Client client){
        clientRepository.save(client);
    }

    public void updateClient(Client client){
        clientRepository.save(client);
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }



}
