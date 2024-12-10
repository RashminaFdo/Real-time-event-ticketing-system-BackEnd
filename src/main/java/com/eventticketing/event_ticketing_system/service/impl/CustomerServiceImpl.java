package com.eventticketing.event_ticketing_system.service.impl;

import com.eventticketing.event_ticketing_system.entity.Customer;
import com.eventticketing.event_ticketing_system.exception.CustomException;
import com.eventticketing.event_ticketing_system.repository.CustomerRepository;
import com.eventticketing.event_ticketing_system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomException("Customer with ID " + id + " not found"));
    }
}
