package com.eventticketing.event_ticketing_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// This class is used to create a default controller that returns a welcome message when the application is started.
@RestController
public class DefaultController {
// This method returns a welcome message when the application is started.
    @GetMapping("/")
    public String home() {
        return "Welcome to the Event Ticketing System Backend!";
    }
}
