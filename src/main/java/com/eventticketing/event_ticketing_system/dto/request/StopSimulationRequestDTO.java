package com.eventticketing.event_ticketing_system.dto.request;

import lombok.Data;

@Data
public class StopSimulationRequestDTO {
    private String stopReason; // Optional field to indicate why the simulation was stopped
}
