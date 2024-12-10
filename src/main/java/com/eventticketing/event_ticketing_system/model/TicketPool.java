package com.eventticketing.event_ticketing_system.model;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
public class TicketPool {

    private final Queue<Ticket> ticketQueue = new LinkedList<>();
    private final int maxCapacity = 100; // Default max capacity

    // Add a ticket to the pool
    public synchronized void addTicket(Ticket ticket) throws InterruptedException {
        while (ticketQueue.size() >= maxCapacity) {
            wait();
        }
        ticketQueue.add(ticket);
        notifyAll();
    }

    // Consume a ticket from the pool
    public synchronized Ticket consumeTicket() throws InterruptedException {
        while (ticketQueue.isEmpty()) {
            wait();
        }
        Ticket ticket = ticketQueue.poll();
        notifyAll();
        return ticket;
    }

    // Clear all tickets from the pool
    public synchronized void clearPool() {
        ticketQueue.clear();
    }

    // Get the current size of the pool
    public synchronized int getSize() {
        return ticketQueue.size();
    }
}
