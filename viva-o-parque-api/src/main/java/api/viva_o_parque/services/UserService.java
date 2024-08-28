package api.viva_o_parque.services;

import api.viva_o_parque.entities.User;
import api.viva_o_parque.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findUsers() {
        return repository.findAll();
    }

    public User findUserById(Long id) {
        Optional<User> op = repository.findById(id);
        User user = new User();
        if(op.isPresent()){
            user = op.get();
        }
        return user;
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public User updateUser(Long id, User user) {
        Optional<User> op = repository.findById(id);
        if (op.isPresent()) {
            user.setId(id);
            return repository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        Optional<User> op = repository.findById(id);
        if (op.isPresent()) {
            repository.deleteById(id);
        }
    }
}
