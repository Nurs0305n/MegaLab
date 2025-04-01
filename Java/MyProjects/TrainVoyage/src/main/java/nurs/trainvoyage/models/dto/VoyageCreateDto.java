package nurs.trainvoyage.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record VoyageCreateDto(
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate sendDate,
        @JsonFormat(pattern = "HH:mm")
        LocalTime sendTime,
        long destinationPointId,
        long startPointId,
        @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
        LocalDateTime arrivalDate,
        long trainId,
        double distance,
        double price
) {
}
