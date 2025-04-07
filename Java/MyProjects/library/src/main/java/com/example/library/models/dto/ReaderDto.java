package com.example.library.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.sql.Date;

public record ReaderDto(
        Long id,
        String firstName,
        String lastName,
        String address,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate dateOfBirth,
        String ticketNumber,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate expireDate
) {
    public ReaderDto(
            Long id,
            String firstName,
            String lastName,
            String address,
            Date dateOfBirth,
            String ticketNumber,
            Date startDate,
            Date expireDate
    ){
        this(id, firstName, lastName, address, dateOfBirth.toLocalDate(),ticketNumber, expireDate.toLocalDate());
    }
}
