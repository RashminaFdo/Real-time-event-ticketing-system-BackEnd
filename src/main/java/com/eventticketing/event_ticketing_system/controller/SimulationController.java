package com.eventticketing.event_ticketing_system.controller;

import com.eventticketing.event_ticketing_system.dto.request.StartSimulationRequestDTO;
import com.eventticketing.event_ticketing_system.dto.response.SimulationStatusResponseDTO;
import com.eventticketing.event_ticketing_system.exception.CustomException;
import com.eventticketing.event_ticketing_system.exception.ErrorResponse;
import com.eventticketing.event_ticketing_system.service.SimulationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/simulation")
public class SimulationController {

    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping("/start")
    public ResponseEntity<SimulationStatusResponseDTO> startSimulation(@RequestBody StartSimulationRequestDTO requestDTO) {
        SimulationStatusResponseDTO response = simulationService.startSimulation(requestDTO);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/stop/{simulationId}")
    public ResponseEntity<SimulationStatusResponseDTO> stopSimulation(@PathVariable Long simulationId) {
        SimulationStatusResponseDTO response = simulationService.stopSimulation(simulationId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{simulationId}")
    public ResponseEntity<?> getSimulationById(@PathVariable Long simulationId) {
        try {
            return ResponseEntity.ok(simulationService.getSimulationStatus(simulationId));
        } catch (CustomException e) {
            return new ResponseEntity<>(new ErrorResponse("Error", e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

}
