package com.eventticketing.event_ticketing_system.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
// This class is used to create a controller that processes and broadcasts log messages.
@Controller
public class LogController {

    @MessageMapping("/logs") // Endpoint for incoming messages
    @SendTo("/topic/logs")   // Endpoint for broadcasting messages
    public String processLog(String logMessage) {
        return logMessage; // Broadcasts the message to subscribers
    }
}
