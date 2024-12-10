package com.eventticketing.event_ticketing_system.repository;

import com.eventticketing.event_ticketing_system.entity.Simulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulationRepository extends JpaRepository<Simulation, Long> {
}
