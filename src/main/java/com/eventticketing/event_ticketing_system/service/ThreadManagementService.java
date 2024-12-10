package com.eventticketing.event_ticketing_system.service;

import com.eventticketing.event_ticketing_system.dto.ConfigurationRequest;
import com.eventticketing.event_ticketing_system.threads.Customer;
import com.eventticketing.event_ticketing_system.threads.Vendor;
import com.eventticketing.event_ticketing_system.model.TicketPool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThreadManagementService {

    private final TicketPool ticketPool;
    private List<Thread> vendorThreads = new ArrayList<>();
    private List<Thread> customerThreads = new ArrayList<>();

    public ThreadManagementService(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    public void initializeThreads(ConfigurationRequest configRequest) {

    }

    public void startThreads() {
        vendorThreads.forEach(Thread::start);
        customerThreads.forEach(Thread::start);
    }

    public void stopThreads() {
        vendorThreads.forEach(Thread::interrupt);
        customerThreads.forEach(Thread::interrupt);
    }

    public String getSystemStatus() {
        return vendorThreads.isEmpty() && customerThreads.isEmpty() ? "STOPPED" : "RUNNING";
    }

    public int getActiveVendors() {
        return vendorThreads.size();
    }

    public int getActiveCustomers() {
        return customerThreads.size();
    }

    public void initialize(ConfigurationRequest configRequest) {
    }

    public List<Thread> getVendorThreads() {
    return vendorThreads;
    }

    public List<Thread> getCustomerThreads() {
    return customerThreads;
    }
}
