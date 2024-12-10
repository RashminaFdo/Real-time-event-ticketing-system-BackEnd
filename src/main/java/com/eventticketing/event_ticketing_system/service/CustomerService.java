package com.eventticketing.event_ticketing_system.service;

import com.eventticketing.event_ticketing_system.entity.Customer;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    Customer getCustomerById(Long id);
}
