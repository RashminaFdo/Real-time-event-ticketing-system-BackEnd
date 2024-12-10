package com.eventticketing.event_ticketing_system.dto.response;

import lombok.Data;

@Data
public class ConfigurationResponseDTO {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;
    private String statusMessage; // E.g., "Configuration loaded successfully"
}
