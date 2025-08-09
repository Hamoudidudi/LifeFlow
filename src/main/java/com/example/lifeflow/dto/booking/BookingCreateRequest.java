package com.example.lifeflow.dto.booking;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BookingCreateRequest {
    @NotBlank
    private String userName;

    @NotNull
    private Long eventId;

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public Long getEventId() { return eventId; }
    public void setEventId(Long eventId) { this.eventId = eventId; }
}
