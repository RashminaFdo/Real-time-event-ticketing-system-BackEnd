package com.eventticketing.event_ticketing_system.dto.response;

import lombok.Data;

@Data
public class SimulationStatusResponseDTO {
    private String status; // E.g., "Running", "Stopped"
    private String message; // Additional info, e.g., "Simulation completed successfully"
    private Long simulationId; // ID of the simulation
}
