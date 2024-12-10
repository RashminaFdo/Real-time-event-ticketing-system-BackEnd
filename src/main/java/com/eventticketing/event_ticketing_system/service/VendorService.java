package com.eventticketing.event_ticketing_system.service;

import com.eventticketing.event_ticketing_system.entity.Vendor;

public interface VendorService {
    Vendor createVendor(Vendor vendor);
    void updateVendor(Vendor vendor);
    Vendor getVendorById(Long id);
}
