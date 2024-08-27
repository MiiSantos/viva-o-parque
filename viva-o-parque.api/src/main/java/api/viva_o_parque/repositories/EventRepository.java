package api.viva_o_parque.repositories;

import api.viva_o_parque.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
