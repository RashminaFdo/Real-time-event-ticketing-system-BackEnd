package com.eventticketing.event_ticketing_system.exception;

// This class is used to create an exception that is thrown when the configuration is invalid.
public class InvalidConfigurationException extends RuntimeException {

    public InvalidConfigurationException(String message) {
        super(message);
    }

    public InvalidConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
