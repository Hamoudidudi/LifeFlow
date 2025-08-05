package com.example.lifeflow.controller;

import com.example.lifeflow.model.Event;
import com.example.lifeflow.repository.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventRepository eventRepository;

    // ✅ Constructor Injection
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    // GET: Alle Events abrufen
    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // POST: Neues Event speichern
    @PostMapping
    public Event addEvent(@RequestBody Event newEvent) {
        return eventRepository.save(newEvent);
    }
}