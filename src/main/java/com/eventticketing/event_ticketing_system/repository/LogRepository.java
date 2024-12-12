package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.model.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// This interface is used to create a repository for the TransactionLog model.
public interface LogRepository extends JpaRepository<TransactionLog, Integer> {
}
