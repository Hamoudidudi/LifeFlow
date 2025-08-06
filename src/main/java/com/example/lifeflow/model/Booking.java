package com.example.lifeflow.model;



import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private int seats;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    // Getter/Setter
    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }
    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }
}
