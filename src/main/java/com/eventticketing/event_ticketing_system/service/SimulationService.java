package com.eventticketing.event_ticketing_system.service;

import com.eventticketing.event_ticketing_system.dto.ConfigurationRequest;
import com.eventticketing.event_ticketing_system.dto.StatusResponse;
import com.eventticketing.event_ticketing_system.model.TicketPool;
import com.eventticketing.event_ticketing_system.threads.Customer;
import com.eventticketing.event_ticketing_system.threads.Vendor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationService {

    private final TicketPool ticketPool;
    private final ThreadManagementService threadManagementService;

    private List<Thread> vendorThreads = new ArrayList<>();
    private List<Thread> customerThreads = new ArrayList<>();
    private boolean isRunning = false;

    // Constructor for dependency injection
    public SimulationService(TicketPool ticketPool, ThreadManagementService threadManagementService) {
        this.ticketPool = ticketPool;
        this.threadManagementService = threadManagementService;
    }

    // Method to start the simulation
    public void startSimulation(ConfigurationRequest configRequest) {
        if (isRunning) {
            throw new IllegalStateException("Simulation is already running.");
        }

        // Initialize threads based on the configuration
        threadManagementService.initializeThreads(configRequest);

        vendorThreads = threadManagementService.getVendorThreads();
        customerThreads = threadManagementService.getCustomerThreads();

        // Start all threads
        vendorThreads.forEach(Thread::start);
        customerThreads.forEach(Thread::start);

        isRunning = true;
    }

    // Method to stop the simulation
    public void stopSimulation() {
        if (!isRunning) {
            throw new IllegalStateException("Simulation is not running.");
        }

        // Stop all threads
        threadManagementService.stopThreads();

        vendorThreads.clear();
        customerThreads.clear();

        isRunning = false;
    }

    // Method to reset the simulation
    public void resetSimulation() {
        // Stop the simulation if running
        stopSimulation();

        // Clear the ticket pool
        ticketPool.clearPool();
    }

    // Method to get the current status of the simulation
    public StatusResponse getStatus() {
        return new StatusResponse(
                isRunning ? "RUNNING" : "STOPPED",
                ticketPool.getSize(),
                vendorThreads.size(),
                customerThreads.size()
        );
    }
}
