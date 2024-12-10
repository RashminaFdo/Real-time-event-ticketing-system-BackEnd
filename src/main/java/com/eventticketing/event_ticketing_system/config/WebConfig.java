package com.eventticketing.event_ticketing_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
@EnableWebMvc
public class WebConfig {

    // Swagger Configuration
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eventticketing.event_ticketing_system.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {//source: https://medium.com/@stefan.paladuta17/spring-boot-using-swagger-at-maximum-apiinfo-ef2ba65ebb86
        return new ApiInfo(
                "Event Ticketing System API",
                "API documentation for Event Ticketing System backend.",
                "1.0",
                "Terms of service URL (https://github.com/RashminaFdo/Real-time-event-ticketing-system-GUI.git)",
                new Contact("Rashmina-Fernando", "www.linkedin.com/in/rashminafernando", "rashmina.20230450@iit.ac.lk"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }
}