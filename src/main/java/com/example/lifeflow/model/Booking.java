package com.example.lifeflow.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user;
    private int seats;

    @ManyToOne
    @JoinColumn(name = "event_id")
    @JsonBackReference
    private Event event;

    public Booking() {}

    public Booking(String user, int seats) {
        this.user = user;
        this.seats = seats;
    }

    // Getter & Setter
    public Long getId() { return id; }
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }
    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }
}