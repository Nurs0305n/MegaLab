package kg.mega.library.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.mega.library.enums.RentStatus;

import java.time.LocalDate;

public record RentDto(
        Long rentId,
        ReaderDto reader,
        BookDto book,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate startDate,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate endDate,
        RentStatus status,
        double totalPrice
) {
}
