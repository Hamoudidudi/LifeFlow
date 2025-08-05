package com.example.lifeflow.model;

public class Event {
    private int id;
    private String name;
    private String time;

    public Event(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getTime() { return time; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setTime(String time) { this.time = time; }
}
