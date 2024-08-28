package api.viva_o_parque.services;

import api.viva_o_parque.repositories.EventRepository;
import api.viva_o_parque.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public List<Event> findEvents() {
        return repository.findAll();
    }

    public Event findEventById(Long id) {
        Optional<Event> op = repository.findById(id);
        Event event = new Event();
        if(op.isPresent()) {
            event = op.get();
        }
        return event;
    }

    public Event createEvent(Event event) {
        return repository.save(event);
    }

    public Event updateUser(Long id, Event event) {
        Optional<Event> op = repository.findById(id);
        if (op.isPresent()) {
            event.setId(id);
            return repository.save(event);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        Optional<Event> op = repository.findById(id);
        if (op.isPresent()) {
            repository.deleteById(id);
        }
    }
}
