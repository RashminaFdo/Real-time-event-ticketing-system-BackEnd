package com.eventticketing.event_ticketing_system.dto.response;

import lombok.Data;

@Data
public class TicketPoolResponseDTO {
    private int ticketsAvailable;
    private int maxCapacity;
}
