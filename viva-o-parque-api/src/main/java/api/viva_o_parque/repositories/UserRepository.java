package api.viva_o_parque.repositories;

import api.viva_o_parque.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
