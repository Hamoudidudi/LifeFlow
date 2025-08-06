package com.example.lifeflow.controller;

import com.example.lifeflow.model.Booking;
import com.example.lifeflow.model.Event;
import com.example.lifeflow.repository.BookingRepository;
import com.example.lifeflow.repository.EventRepository;

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
    public Booking createBooking(@RequestBody Booking booking) {
        Event event = eventRepository.findById(booking.getEvent().getId()).orElseThrow();
        booking.setEvent(event);
        return bookingRepository.save(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}