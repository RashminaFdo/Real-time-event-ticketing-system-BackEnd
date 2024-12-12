package com.eventticketing.event_ticketing_system.threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;
// This class is used to create a customer that buys tickets from the ticket pool.
public class Customer implements Runnable {
    private final TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }
    // This method is used to buy tickets from the ticket pool.
    @Override
    public void run() {
        while (true) {
            Ticket ticket = ticketPool.retrieveTicket();
            if (ticket != null) {
                System.out.println("[Customer] Ticket ID: " + ticket.getId() + " bought for event: " + ticket.getEventName());
            } else {
                System.out.println("[Customer] No tickets available.");
            }
        }
    }
}
