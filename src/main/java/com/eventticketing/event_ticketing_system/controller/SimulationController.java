package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.dto.SimulationRequest;
import com.eventticketing.event_ticketing_system.service.SimulationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// This class is used to create a controller that processes simulation requests.
@RestController
// This annotation maps the controller to the /api/simulation path.
@RequestMapping("/api/simulation")
public class SimulationController {

    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }
    // This method starts the simulation with the specified parameters.
    @PostMapping("/start")
    public String startSimulation(@RequestBody SimulationRequest request) {
        simulationService.startSimulation(
                request.getTotalTickets(),
                request.getTicketReleaseRate(),
                request.getCustomerRetrievalRate(),
                request.getMaxTicketCapacity()
        );
        return "Simulation started with parameters: " + request;
    }
    // This method stops the simulation.
    @PostMapping("/stop")
    public String stopSimulation() {
        simulationService.stopSimulation();
        return "Simulation stopped.";
    }
    // This method resets the simulation.
    @PostMapping("/reset")
    public String resetSimulation() {
        simulationService.resetSimulation();
        return "Simulation reset. You can now start again.";
    }
    // This method returns the current status of the simulation.
    @GetMapping("/status")
    public String getStatus() {
        return simulationService.getSystemStatus();
    }
    // This method returns the number of available tickets.
    @GetMapping("/available-tickets")
    public int getAvailableTickets() {
        return simulationService.getAvailableTicketsCount();
    }
    // This method returns the number of customers in the system.
    @GetMapping("/activity-logs")
    public List<String> getActivityLogs() {
        return simulationService.getActivityLogs();
    }
}
