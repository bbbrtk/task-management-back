package pl.project.promanage.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.promanage.task.Task;
import pl.project.promanage.team.Team;
import pl.project.promanage.user.customer.CustomerRepository;
import pl.project.promanage.user.worker.WorkerRepository;
import pl.project.promanage.user.worker.developer.DeveloperRepository;
import pl.project.promanage.user.worker.manager.ManagerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();

        for (User user : userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public Team getTeam(Long id){
        return userRepository.getTeam(id);
    }

    public List<Task> getHomeCardTasks(Long id) {
        return userRepository.getTopTasks(id);
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


    public User authUser(String name) {
        User user = userRepository.findByName(name).orElse(null);
        if(user != null) return user;
        return null;
    }
}
