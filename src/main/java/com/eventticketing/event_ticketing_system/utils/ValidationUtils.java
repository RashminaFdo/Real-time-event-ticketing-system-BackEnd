package com.eventticketing.event_ticketing_system.utils;

import com.eventticketing.event_ticketing_system.dto.ConfigurationRequest;
import org.springframework.stereotype.Component;

@Component
public class ValidationUtils {

    public void validateConfiguration(ConfigurationRequest configRequest) {
        if (configRequest.getTotalTickets() <= 0) {
            throw new IllegalArgumentException("Total tickets must be greater than 0.");
        }
        if (configRequest.getTicketReleaseRate() <= 0) {
            throw new IllegalArgumentException("Ticket release rate must be greater than 0.");
        }
        if (configRequest.getCustomerRetrievalRate() <= 0) {
            throw new IllegalArgumentException("Customer retrieval rate must be greater than 0.");
        }
        if (configRequest.getMaxCapacity() < configRequest.getTotalTickets()) {
            throw new IllegalArgumentException("Max capacity must be greater than or equal to total tickets.");
        }
    }
}
