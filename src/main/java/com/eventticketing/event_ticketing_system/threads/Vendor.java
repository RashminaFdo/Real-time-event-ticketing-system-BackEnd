package com.eventticketing.event_ticketing_system.threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;
// This class is used to create a vendor that adds tickets to the ticket pool.
public class Vendor implements Runnable {
    private final TicketPool ticketPool;
    private final int totalTickets;
    // This constructor initializes the vendor with the ticket pool and the total number of tickets to add.
    public Vendor(TicketPool ticketPool, int totalTickets) {
        this.ticketPool = ticketPool;
        this.totalTickets = totalTickets;
    }
    // This method adds tickets to the ticket pool.
    @Override
    public void run() {
        for (int i = 0; i < totalTickets; i++) {
            Ticket ticket = new Ticket("Event " + (i + 1), false);
            ticketPool.addTicket(ticket);
            System.out.println("[Vendor] Ticket added: " + ticket.getEventName());
        }
    }
}
