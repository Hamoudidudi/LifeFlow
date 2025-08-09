package com.example.lifeflow.dto.booking;

public class BookingResponse {
    private Long id;
    private String userName;
    private Long eventId;

    public BookingResponse(Long id, String userName, Long eventId) {
        this.id = id; this.userName = userName; this.eventId = eventId;
    }
    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public Long getEventId() { return eventId; }
}
