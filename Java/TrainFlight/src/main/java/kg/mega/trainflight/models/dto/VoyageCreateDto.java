package kg.mega.trainflight.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record VoyageCreateDto(
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate sendDate,
        @JsonFormat(pattern = "HH:mm")
        LocalTime sendTime,
        @JsonProperty("destination")
        long destinationLocality,
        long startingLocality,
        @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
        LocalDateTime arrivalTime,
        long trainId,
        double distance,
        double price
) {
}
