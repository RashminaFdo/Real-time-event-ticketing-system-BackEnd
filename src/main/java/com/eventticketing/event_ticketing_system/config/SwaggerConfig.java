package com.eventticketing.event_ticketing_system.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// This class is used to configure Swagger for the application.
@Configuration
public class SwaggerConfig {

    @Bean
    // This method creates a new OpenAPI object and sets the title, version, and description of the API.
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Event Ticketing System API")
                        .version("1.0.0")
                        .description("API documentation for the Event Ticketing System"));
    }
}
