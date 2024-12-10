package com.eventticketing.event_ticketing_system.service.impl;
import com.eventticketing.event_ticketing_system.config.Configuration;

import com.eventticketing.event_ticketing_system.dto.request.ConfigurationRequestDTO;
import com.eventticketing.event_ticketing_system.entity.Ticket;
import com.eventticketing.event_ticketing_system.repository.TicketRepository;
import com.eventticketing.event_ticketing_system.service.TicketService;
import com.eventticketing.event_ticketing_system.utils.ConfigUtils;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket consumeTicket(Long id) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticketRepository.delete(ticket);
        return ticket;
    }

    @Override
    public void updateTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void saveConfiguration(ConfigurationRequestDTO configurationRequestDTO, String filePath) {
        // Save the configuration as a JSON file
        ConfigUtils.saveConfiguration(configurationRequestDTO, filePath);
    }

    @Override
    public void loadConfiguration(String filePath) {
        // Load the configuration from a file
        ConfigurationRequestDTO configurationRequestDTO = ConfigUtils.loadConfiguration(filePath);
        System.out.println("Configuration loaded: " + configurationRequestDTO);
    }

    // If this method isn't needed, you can remove it.
    @Override
    public void saveConfiguration(String filePath) {
        // You can either leave this empty or remove it since it's redundant.
    }

    // If this method isn't needed, you can remove it as well.
    @Override
    public void saveConfiguration(String filePath, ConfigurationRequestDTO configurationDTO) {
        // This can be combined with the previous saveConfiguration method.
    }

    @Override
    public Configuration getCurrentConfiguration() {
        return null;
    }
}
