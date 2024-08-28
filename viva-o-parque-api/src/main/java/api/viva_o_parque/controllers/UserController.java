package api.viva_o_parque.controllers;

import api.viva_o_parque.entities.User;
import api.viva_o_parque.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> listUsers() {
        return service.findUsers();
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable Long id) {
        return service.findUserById(id);
    }
}
