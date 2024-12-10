package com.eventticketing.event_ticketing_system.dto;

public class StatusResponse {
    private String systemStatus;
    private int ticketsAvailable;
    private int activeVendors;
    private int activeCustomers;

    // Constructor
    public StatusResponse(String systemStatus, int ticketsAvailable, int activeVendors, int activeCustomers) {
        this.systemStatus = systemStatus;
        this.ticketsAvailable = ticketsAvailable;
        this.activeVendors = activeVendors;
        this.activeCustomers = activeCustomers;
    }

    // Getters and Setters
    public String getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public int getActiveVendors() {
        return activeVendors;
    }

    public void setActiveVendors(int activeVendors) {
        this.activeVendors = activeVendors;
    }

    public int getActiveCustomers() {
        return activeCustomers;
    }

    public void setActiveCustomers(int activeCustomers) {
        this.activeCustomers = activeCustomers;
    }
}
