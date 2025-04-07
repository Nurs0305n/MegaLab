package kg.mega.library.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record ReaderUpdateDto(
        Long readerId,
        String firstName,
        String lastName,
        String address,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate dateOfBirth
) {
}
