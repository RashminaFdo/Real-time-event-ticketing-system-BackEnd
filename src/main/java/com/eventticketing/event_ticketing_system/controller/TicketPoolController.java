package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.dto.response.TicketPoolResponseDTO;
import com.eventticketing.event_ticketing_system.service.TicketPoolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ticket-pool")
public class TicketPoolController {

    private final TicketPoolService ticketPoolService;

    public TicketPoolController(TicketPoolService ticketPoolService) {
        this.ticketPoolService = ticketPoolService;
    }

    @GetMapping(path = "ticket-pool-status")
    public ResponseEntity<?> getCurrentTicketPoolStatus() {
        return ResponseEntity.ok(ticketPoolService.getTicketPoolStatus());
    }

}
