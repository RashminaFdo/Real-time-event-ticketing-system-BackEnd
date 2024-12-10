package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.model.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<TransactionLog, Long> {
    // Add custom methods if necessary
}
