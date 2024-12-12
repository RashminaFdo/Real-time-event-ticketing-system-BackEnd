package com.eventticketing.event_ticketing_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// This class is used to run the Spring Boot application.
public class EventTicketingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventTicketingSystemApplication.class, args);
		System.out.println("Event Ticketing System backend is running...");
	}
}
