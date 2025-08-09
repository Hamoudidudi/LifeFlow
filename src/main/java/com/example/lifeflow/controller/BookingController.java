package com.example.lifeflow.controller;

import com.example.lifeflow.dto.booking.BookingCreateRequest;
import com.example.lifeflow.dto.booking.BookingResponse;
import com.example.lifeflow.model.Booking;
import com.example.lifeflow.model.Event;
import com.example.lifeflow.error.ResourceNotFoundException;
import com.example.lifeflow.repository.BookingRepository;
import com.example.lifeflow.repository.EventRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingRepository bookingRepository;
    private final EventRepository eventRepository;

    public BookingController(BookingRepository bookingRepository, EventRepository eventRepository) {
        this.bookingRepository = bookingRepository;
        this.eventRepository = eventRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookingResponse create(@Valid @RequestBody BookingCreateRequest req) {
        Event event = eventRepository.findById(req.getEventId())
                .orElseThrow(() -> new ResourceNotFoundException("Event not found: id=" + req.getEventId()));

        Booking b = new Booking();
        b.setUserName(req.getUserName());
        b.setEvent(event);

        Booking saved = bookingRepository.save(b);
        return new BookingResponse(saved.getId(), saved.getUserName(), saved.getEvent().getId());
    }

    @GetMapping
    public List<BookingResponse> list() {
        return bookingRepository.findAll().stream()
                .map(b -> new BookingResponse(b.getId(), b.getUserName(), b.getEvent().getId()))
                .toList();
    }
}
