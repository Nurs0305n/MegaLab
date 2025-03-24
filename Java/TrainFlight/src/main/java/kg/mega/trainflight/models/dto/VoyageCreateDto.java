package kg.mega.trainflight.models.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record VoyageCreateDto(
        LocalDate sendDate,
        LocalTime sendTime,
        long destinationLocality,
        long startingLocality,
        LocalDateTime arrivalTime,
        long trainId,
        double distance,
        double price
) {
}
