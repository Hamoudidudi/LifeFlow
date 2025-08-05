package com.example.lifeflow.controller;

import com.example.lifeflow.model.Booking;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private List<Booking> bookings = new ArrayList<>(Arrays.asList(
            new Booking(1, 1, "Gafora"),
            new Booking(2, 2, "Hamoudi")
    ));

    // GET: alle Buchungen
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookings;
    }

    // POST: neue Buchung
    @PostMapping
    public Booking addBooking(@RequestBody Booking newBooking) {
        bookings.add(newBooking);
        return newBooking;
    }
}