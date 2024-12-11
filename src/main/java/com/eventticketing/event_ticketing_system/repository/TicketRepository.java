package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
