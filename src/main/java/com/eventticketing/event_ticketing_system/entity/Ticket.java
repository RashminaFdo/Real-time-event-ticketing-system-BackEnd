package com.eventticketing.event_ticketing_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {
    @Id
    private Long id;
    private String eventName;
    private int price;
}
