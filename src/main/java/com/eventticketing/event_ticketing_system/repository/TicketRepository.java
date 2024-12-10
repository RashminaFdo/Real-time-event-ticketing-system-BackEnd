package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Add custom methods if necessary
}
