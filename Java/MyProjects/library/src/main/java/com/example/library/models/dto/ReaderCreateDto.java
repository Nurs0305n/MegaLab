package com.example.library.models.dto;

import java.time.LocalDate;

public record ReaderCreateDto(
        String firstName,
        String lastName,
        String address,
        LocalDate dateOfBirth
) {
}
