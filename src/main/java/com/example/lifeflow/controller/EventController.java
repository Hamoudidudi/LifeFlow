package com.example.lifeflow.controller;

import com.example.lifeflow.model.Event;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/events")
public class EventController {

    private List<Event> events = new ArrayList<>(Arrays.asList(
            new Event(1, "Kino: Oppenheimer", "19:00"),
            new Event(2, "Dinner: Schawrma", "21:30")
    ));

    // GET alle Events
    @GetMapping
    public List<Event> getAllEvents() {
        return events;
    }

    // POST neues Event
    @PostMapping
    public Event addEvent(@RequestBody Event newEvent) {
        events.add(newEvent);
        return newEvent;
    }
}