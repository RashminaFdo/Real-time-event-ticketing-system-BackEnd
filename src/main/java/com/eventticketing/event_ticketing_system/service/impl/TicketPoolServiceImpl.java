package com.eventticketing.event_ticketing_system.service.impl;

import com.eventticketing.event_ticketing_system.dto.response.TicketPoolResponseDTO;
import com.eventticketing.event_ticketing_system.entity.TicketPool;
import com.eventticketing.event_ticketing_system.repository.TicketPoolRepository;
import com.eventticketing.event_ticketing_system.service.TicketPoolService;
import org.springframework.stereotype.Service;

@Service
public class TicketPoolServiceImpl implements TicketPoolService {
    private final TicketPoolRepository ticketPoolRepository;

    public TicketPoolServiceImpl(TicketPoolRepository ticketPoolRepository) {
        this.ticketPoolRepository = ticketPoolRepository;
    }

    @Override
    public TicketPoolResponseDTO getTicketPoolStatus() {
        TicketPool ticketPool = ticketPoolRepository.findAll().stream().findFirst()
                .orElseThrow(() -> new RuntimeException("Ticket pool not initialized!"));
        return new TicketPoolResponseDTO(ticketPool.getCurrentSize(), ticketPool.getMaxCapacity());
    }
}
