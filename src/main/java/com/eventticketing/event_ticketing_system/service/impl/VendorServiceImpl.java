package com.eventticketing.event_ticketing_system.service.impl;

import com.eventticketing.event_ticketing_system.entity.Vendor;
import com.eventticketing.event_ticketing_system.exception.CustomException;
import com.eventticketing.event_ticketing_system.repository.VendorRepository;
import com.eventticketing.event_ticketing_system.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public void updateVendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }

    @Override
    public Vendor getVendorById(Long id) {
        return vendorRepository.findById(id)
                .orElseThrow(() -> new CustomException("Vendor with ID " + id + " not found"));
    }
}
