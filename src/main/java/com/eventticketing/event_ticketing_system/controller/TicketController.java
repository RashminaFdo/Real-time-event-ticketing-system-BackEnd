package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.repository.TicketRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/tickets")
// This class is used to create a controller that processes ticket requests.
public class TicketController {

    private final TicketRepository ticketRepository;
    // This constructor injects the ticket repository into the controller.
    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    // This method returns all tickets in the database.
    @GetMapping
    public List<Ticket> getAllTickets() {
        return StreamSupport.stream(ticketRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
