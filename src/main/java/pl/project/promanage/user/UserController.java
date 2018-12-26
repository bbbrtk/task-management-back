package pl.project.promanage.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Long id){
        userService.updateUser(user);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @PostMapping("/users/auth")
    public @ResponseBody User authUser(@RequestBody String name ){

        if (name != null && name.length() > 0 && name.charAt(name.length() - 1) == '=') {  //nie wiem czemu ale doklejalo '=' na koncu name ... :(
            name = name.substring(0, name.length() - 1);
        }
        return userService.authUser(name);
    }

}
