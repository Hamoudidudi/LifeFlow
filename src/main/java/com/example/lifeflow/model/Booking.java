package com.example.lifeflow.model;

public class Booking {
    private int id;
    private int eventId;
    private String userName;

    public Booking(int id, int eventId, String userName) {
        this.id = id;
        this.eventId = eventId;
        this.userName = userName;
    }

    public int getId() { return id; }
    public int getEventId() { return eventId; }
    public String getUserName() { return userName; }

    public void setId(int id) { this.id = id; }
    public void setEventId(int eventId) { this.eventId = eventId; }
    public void setUserName(String userName) { this.userName = userName; }
}