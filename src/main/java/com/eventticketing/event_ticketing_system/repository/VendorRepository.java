package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
