package com.eventticketing.event_ticketing_system.exception;

public class ErrorResponse {
    private String status;
    private String message;

    public ErrorResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

}

