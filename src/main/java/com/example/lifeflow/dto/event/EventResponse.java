package com.example.lifeflow.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class EventResponse {
    private Long id;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime eventTime;

    public EventResponse(Long id, String name, LocalDateTime eventTime) {
        this.id = id; this.name = name; this.eventTime = eventTime;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public LocalDateTime getEventTime() { return eventTime; }
}
