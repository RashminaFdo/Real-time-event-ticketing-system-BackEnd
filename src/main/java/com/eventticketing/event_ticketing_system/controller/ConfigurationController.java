package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.dto.request.ConfigurationRequestDTO;
import com.eventticketing.event_ticketing_system.service.impl.TicketServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/configuration")
public class ConfigurationController {

    private final TicketServiceImpl ticketService;

    public ConfigurationController(TicketServiceImpl ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/manual")
    public ResponseEntity<String> setManualConfiguration(@RequestBody ConfigurationRequestDTO configurationDTO) {
        ticketService.setManualConfiguration(configurationDTO); // Updated to use ticketService
        return ResponseEntity.ok("Configuration saved successfully!");
    }

    @PostMapping("/load")
    public ResponseEntity<String> loadConfiguration(@RequestParam String filePath) {
        ticketService.loadConfiguration(filePath); // Updated to use ticketService
        return ResponseEntity.ok("Configuration loaded successfully!");
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveConfiguration(@RequestParam String filePath) {
        ticketService.saveConfiguration(filePath); // Updated to use ticketService
        return ResponseEntity.ok("Configuration saved successfully!");
    }
}
