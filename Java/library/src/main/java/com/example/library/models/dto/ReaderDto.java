package com.example.library.models.dto;

import java.time.LocalDate;

public record ReaderDto(
        Long id,
        String firstName,
        String lastName,
        String address,
        LocalDate dateOfBirth,
        String ticketNumber,
        LocalDate expireDate
) {
}
