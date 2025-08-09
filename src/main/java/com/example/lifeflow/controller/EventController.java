package com.example.lifeflow.controller;

import com.example.lifeflow.dto.event.EventCreateRequest;
import com.example.lifeflow.dto.event.EventResponse;
import com.example.lifeflow.model.Event;
import com.example.lifeflow.repository.EventRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventRepository eventRepository;
    public EventController(EventRepository eventRepository) { this.eventRepository = eventRepository; }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EventResponse create(@Valid @RequestBody EventCreateRequest req) {
        Event e = new Event();
        e.setName(req.getName());
        e.setEventTime(req.getEventTime());
        Event saved = eventRepository.save(e);
        return new EventResponse(saved.getId(), saved.getName(), saved.getEventTime());
    }

    @GetMapping
    public List<EventResponse> list() {
        return eventRepository.findAll().stream()
                .map(e -> new EventResponse(e.getId(), e.getName(), e.getEventTime()))
                .toList();
    }
}
