package com.eventticketing.event_ticketing_system.service;

import com.eventticketing.event_ticketing_system.model.TicketPool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationService {

    private TicketPool ticketPool;
    private boolean isRunning = false;
    private final List<String> activityLogs = new ArrayList<>();

    public void restartSimulation(int totalTickets, int ticketReleaseRate, int customerRetrievalRate, int maxTicketCapacity) {
        // Logic to stop the current simulation
        isRunning = false;
        activityLogs.add("Simulation stopped.");

        // Reinitialize the ticket pool with new parameters
        ticketPool = new TicketPool(maxTicketCapacity);
        isRunning = true;
        activityLogs.add("Simulation restarted with parameters: " +
                "Total Tickets: " + totalTickets +
                ", Ticket Release Rate: " + ticketReleaseRate +
                ", Customer Retrieval Rate: " + customerRetrievalRate +
                ", Max Ticket Capacity: " + maxTicketCapacity);
    }

    public String getSystemStatus() {
        return isRunning ? "Running" : "Stopped";
    }
}
