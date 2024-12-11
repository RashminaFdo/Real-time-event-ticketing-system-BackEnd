package com.eventticketing.event_ticketing_system.model;

import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {

    private final int maxCapacity;
    private final Queue<Ticket> pool;

    public TicketPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.pool = new LinkedList<>();
    }

    public synchronized void addTicket(Ticket ticket) {
        while (pool.size() >= maxCapacity) {
            try {
                wait(); // Wait until space is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        pool.add(ticket);
        notifyAll(); // Notify waiting consumers
    }

    public synchronized Ticket retrieveTicket() {
        while (pool.isEmpty()) {
            try {
                wait(); // Wait until a ticket is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        Ticket ticket = pool.poll();
        notifyAll(); // Notify waiting producers
        return ticket;
    }

    public int getRemainingTickets() {
        return pool.size();
    }
}
