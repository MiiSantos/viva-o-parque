package api.viva_o_parque.controllers;

import api.viva_o_parque.entities.Event;
import api.viva_o_parque.entities.User;
import api.viva_o_parque.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class EventController {

    @Autowired
    private EventService service;

    @GetMapping
    public List<Event> listEvents() {
        return service.findEvents();
    }

    @GetMapping("/{id}")
    public Event findEvent(@PathVariable Long id) {
        return service.findEventById(id);
    }

}
