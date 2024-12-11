package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.service.SimulationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/simulation")
public class SimulationController {

    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping("/restart")
    public ResponseEntity<String> restartSimulation(
            @RequestParam Integer totalTickets,
            @RequestParam Integer ticketReleaseRate,
            @RequestParam Integer customerRetrievalRate,
            @RequestParam Integer maxTicketCapacity) {
        simulationService.restartSimulation(totalTickets, ticketReleaseRate, customerRetrievalRate, maxTicketCapacity);
        return ResponseEntity.ok("Simulation restarted successfully");
    }

    @GetMapping("/status")
    public ResponseEntity<String> getSystemStatus() {
        String status = simulationService.getSystemStatus();
        return ResponseEntity.ok(status);
    }
}
