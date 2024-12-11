package com.eventticketing.event_ticketing_system.exception;

/**
 * Custom exception for invalid configuration errors in the ticketing simulation.
 */
public class InvalidConfigurationException extends RuntimeException {

    public InvalidConfigurationException(String message) {
        super(message);
    }

    public InvalidConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
