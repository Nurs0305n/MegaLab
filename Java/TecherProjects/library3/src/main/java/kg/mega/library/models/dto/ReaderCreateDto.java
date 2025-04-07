package kg.mega.library.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record ReaderCreateDto(
        String firstName,
        String lastName,
        String address,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate dateOfBirth
) {
}
