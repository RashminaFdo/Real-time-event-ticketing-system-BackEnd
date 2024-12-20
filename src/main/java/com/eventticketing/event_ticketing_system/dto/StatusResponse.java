package com.eventticketing.event_ticketing_system.dto;
// This class is used to create a status response object.
public class StatusResponse {

    private boolean isRunning;
    private int ticketsAvailable;
    private int totalTicketsSold;

    // Getters and Setters
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    public void setTotalTicketsSold(int totalTicketsSold) {
        this.totalTicketsSold = totalTicketsSold;
    }
}
