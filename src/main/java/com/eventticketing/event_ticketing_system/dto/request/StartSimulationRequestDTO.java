package com.eventticketing.event_ticketing_system.dto.request;

import lombok.Data;

@Data
public class StartSimulationRequestDTO {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;
    private int numberOfVendors;
    private int numberOfCustomers;
}
