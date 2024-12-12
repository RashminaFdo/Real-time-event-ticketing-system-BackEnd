package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
// This interface is used to create a repository for the Ticket model.
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
