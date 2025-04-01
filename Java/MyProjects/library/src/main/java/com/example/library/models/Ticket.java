package com.example.library.models;

import com.example.library.enums.TicketStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "teckets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ticketNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private TicketStatus ticketStatus;
    @ManyToOne
    @JoinColumn(name = "reders_id")
    private Reader reader;
}
