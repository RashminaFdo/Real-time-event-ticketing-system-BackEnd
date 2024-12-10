package com.eventticketing.event_ticketing_system.config;

import lombok.Data;

@Data
public class Configuration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

}
