package com.eventticketing.event_ticketing_system.threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;

public class Vendor implements Runnable {

    private final TicketPool ticketPool;
    private final int releaseRate;

    public Vendor(TicketPool ticketPool, int releaseRate) {
        this.ticketPool = ticketPool;
        this.releaseRate = releaseRate;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                ticketPool.addTicket(new Ticket("Event Ticket")); // Add tickets to the pool
                Thread.sleep(1000 / releaseRate); // Simulate ticket release delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupted status
        }
    }
}
