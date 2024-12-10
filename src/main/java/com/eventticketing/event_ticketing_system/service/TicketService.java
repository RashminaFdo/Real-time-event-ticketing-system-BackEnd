package com.eventticketing.event_ticketing_system.service;

import com.eventticketing.event_ticketing_system.config.Configuration;
import com.eventticketing.event_ticketing_system.dto.request.ConfigurationRequestDTO;
import com.eventticketing.event_ticketing_system.entity.Ticket;

public interface TicketService {
    Ticket createTicket(Ticket ticket);
    Ticket consumeTicket(Long id);
    void updateTicket(Ticket ticket);

    void saveConfiguration(ConfigurationRequestDTO configurationRequestDTO, String filePath);

    void loadConfiguration(String filePath);

    void saveConfiguration(String filePath);

    void saveConfiguration(String filePath, ConfigurationRequestDTO configurationDTO);

    Configuration getCurrentConfiguration();
}
