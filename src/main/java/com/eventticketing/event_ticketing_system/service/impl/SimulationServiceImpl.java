package com.eventticketing.event_ticketing_system.service.impl;

import com.eventticketing.event_ticketing_system.dto.request.StartSimulationRequestDTO;
import com.eventticketing.event_ticketing_system.dto.response.SimulationStatusResponseDTO;
import com.eventticketing.event_ticketing_system.entity.Simulation;
import com.eventticketing.event_ticketing_system.exception.CustomException;
import com.eventticketing.event_ticketing_system.repository.SimulationRepository;
import com.eventticketing.event_ticketing_system.service.SimulationService;
import org.springframework.stereotype.Service;

@Service
public class SimulationServiceImpl implements SimulationService {
    private final SimulationRepository simulationRepository;

    public SimulationServiceImpl(SimulationRepository simulationRepository) {
        this.simulationRepository = simulationRepository;
    }

    @Override
    public SimulationStatusResponseDTO startSimulation(StartSimulationRequestDTO request) {
        Simulation simulation = new Simulation();
        simulation.setTotalTickets(request.getTotalTickets());
        simulation.setTicketReleaseRate(request.getTicketReleaseRate());
        simulation.setCustomerRetrievalRate(request.getCustomerRetrievalRate());
        simulation.setMaxTicketCapacity(request.getMaxTicketCapacity());
        simulation.setStatus(Simulation.Status.RUNNING);
        Simulation savedSimulation = simulationRepository.save(simulation);

        return new SimulationStatusResponseDTO("RUNNING", "Simulation started successfully", savedSimulation.getId());
    }

    @Override
    public SimulationStatusResponseDTO stopSimulation(Long simulationId) {
        Simulation simulation = simulationRepository.findById(simulationId)
                .orElseThrow(() -> new CustomException("Simulation with ID " + simulationId + " not found"));
        simulation.setStatus(Simulation.Status.STOPPED);
        simulationRepository.save(simulation);

        return new SimulationStatusResponseDTO("STOPPED", "Simulation stopped successfully", simulationId);
    }
}
