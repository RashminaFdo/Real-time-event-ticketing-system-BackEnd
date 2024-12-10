package com.eventticketing.event_ticketing_system.exception;

import org.springframework.http.HttpStatus;

public class SuccessResponse {
    private String message;
    private Object data;

    public SuccessResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
