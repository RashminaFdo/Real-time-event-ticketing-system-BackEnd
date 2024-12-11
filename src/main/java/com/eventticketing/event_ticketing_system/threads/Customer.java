package com.eventticketing.event_ticketing_system.threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;


public class Customer implements Runnable {
    private final TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        while (true) { // Simulating continuous ticket booking
            Ticket ticket = ticketPool.retrieveTicket(); // Retrieve a ticket from the pool
            if (ticket != null) {
                logTransaction("Ticket booked: " + ticket.getId()); // Log the booking
            } else {
                System.out.println("No tickets available at the moment."); // Replace with proper logging
            }

            try {
                Thread.sleep(1000); // Simulating delay between customer actions
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void logTransaction(String details) {
        System.out.println(details); // Replace this with proper logging
    }
}
