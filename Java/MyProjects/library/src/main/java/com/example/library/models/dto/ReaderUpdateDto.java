package com.example.library.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record ReaderUpdateDto(
        Long readerID,
        String firstName,
        String lastName,
        String address,
        @JsonFormat(pattern = "dd.MM.yyy")
        LocalDate dateOfBirth
) {
}
