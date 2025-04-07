package com.example.library.models.dto;

import java.time.LocalDate;

public record TicketDto(
        String ticketNumber,
        LocalDate expireDate
) {
}
