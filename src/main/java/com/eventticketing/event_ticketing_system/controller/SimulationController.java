package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.dto.ConfigurationRequest;
import com.eventticketing.event_ticketing_system.dto.StatusResponse;
import com.eventticketing.event_ticketing_system.service.SimulationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/simulation")
public class SimulationController {

    private final SimulationService simulationService;

    // Constructor for dependency injection
    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    // Endpoint to start the simulation
    @PostMapping("/start")
    public ResponseEntity<String> startSimulation(@RequestBody ConfigurationRequest configRequest) {
        simulationService.startSimulation(configRequest);
        return ResponseEntity.ok("Simulation started.");
    }

    // Endpoint to stop the simulation
    @PostMapping("/stop")
    public ResponseEntity<String> stopSimulation() {
        simulationService.stopSimulation();
        return ResponseEntity.ok("Simulation stopped.");
    }

    // Endpoint to reset the simulation
    @PostMapping("/reset")
    public ResponseEntity<String> resetSimulation() {
        simulationService.resetSimulation();
        return ResponseEntity.ok("Simulation reset.");
    }

    // Endpoint to get the current simulation status
    @GetMapping("/status")
    public ResponseEntity<StatusResponse> getStatus() {
        return ResponseEntity.ok(simulationService.getStatus());
    }
}
