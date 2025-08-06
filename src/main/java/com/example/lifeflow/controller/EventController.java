package com.example.lifeflow.controller;

import com.example.lifeflow.model.Event;
import com.example.lifeflow.repository.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/events")
public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}