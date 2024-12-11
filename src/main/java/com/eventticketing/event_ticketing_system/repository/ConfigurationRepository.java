package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.model.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {
}
