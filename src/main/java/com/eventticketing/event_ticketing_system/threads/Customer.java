package com.eventticketing.event_ticketing_system.threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;

public class Customer implements Runnable {

    private final TicketPool ticketPool;
    private final int retrievalRate;

    public Customer(TicketPool ticketPool, int retrievalRate) {
        this.ticketPool = ticketPool;
        this.retrievalRate = retrievalRate;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Ticket ticket = ticketPool.consumeTicket();
                System.out.println("Ticket purchased: " + ticket.getEventName());
                Thread.sleep(1000 / retrievalRate); // Simulate ticket retrieval delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupted status
        }
    }
}
