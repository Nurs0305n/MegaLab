package com.example.library.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "teckets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long ticketNumber;
    LocalDate startDate;
    LocalDate endDate;
    TicketStatus ticketStatus;
    @ManyToOne
    Reader reader;

}
