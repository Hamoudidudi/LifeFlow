package com.example.lifeflow.controller;

import com.example.lifeflow.model.Booking;
import com.example.lifeflow.repository.BookingRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingRepository bookingRepository;

    // ✅ Constructor Injection statt @Autowired am Feld
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    // GET: Alle Bookings abrufen
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // POST: Neues Booking speichern
    @PostMapping
    public Booking addBooking(@RequestBody Booking newBooking) {
        return bookingRepository.save(newBooking);
    }
}