package com.example.lifeflow.error;

import java.time.OffsetDateTime;
import java.util.List;

public class ErrorResponse {
    public static class FieldErrorEntry {
        private final String field;
        private final String message;
        public FieldErrorEntry(String field, String message) {
            this.field = field; this.message = message;
        }
        public String getField() { return field; }
        public String getMessage() { return message; }
    }

    private final OffsetDateTime timestamp;
    private final int status;
    private final String error;
    private final String message;
    private final String path;
    private final List<FieldErrorEntry> details;

    public ErrorResponse(OffsetDateTime timestamp, int status, String error,
                         String message, String path, List<FieldErrorEntry> details) {
        this.timestamp = timestamp; this.status = status; this.error = error;
        this.message = message; this.path = path; this.details = details;
    }

    public OffsetDateTime getTimestamp() { return timestamp; }
    public int getStatus() { return status; }
    public String getError() { return error; }
    public String getMessage() { return message; }
    public String getPath() { return path; }
    public List<FieldErrorEntry> getDetails() { return details; }
}
