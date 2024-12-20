package com.eventticketing.event_ticketing_system.model;

import javax.persistence.*;

@Entity
// This class is used to create a ticket object.
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String eventName;
    private boolean isSold;

    public Ticket() {
    }

    public Ticket(String eventName, boolean isSold) {
        this.eventName = eventName;
        this.isSold = isSold;
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}
