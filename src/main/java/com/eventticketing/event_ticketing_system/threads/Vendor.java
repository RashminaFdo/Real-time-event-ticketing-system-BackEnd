package com.eventticketing.event_ticketing_system.threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;

public class Vendor implements Runnable {

    private final int totalTickets;
    private final TicketPool ticketPool;
    private final String eventName;

    public Vendor(int totalTickets, TicketPool ticketPool, String eventName) {
        this.totalTickets = totalTickets;
        this.ticketPool = ticketPool;
        this.eventName = eventName;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalTickets; i++) {
            Ticket ticket = new Ticket(eventName, false);
            ticketPool.addTicket(ticket);
            logTransaction("Ticket created: " + ticket.getId());
            try {
                Thread.sleep(1000); // Simulating ticket release rate
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void logTransaction(String details) {
        // Log transaction logic here
    }
}
