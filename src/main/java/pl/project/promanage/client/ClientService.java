package pl.project.promanage.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories(basePackages="pl.project.promanage")
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


}
