package kg.mega.train_voyages.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record VoyageCreateDTO(
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate sendDate,
        @JsonFormat(pattern = "HH:mm")
        LocalTime sendTime,
        @JsonProperty("destination_point_id")
        long destinationPointId,
        long startPointId,
        @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
        LocalDateTime arrivalDate,
        long trainId,
        double distance,
        double price
) {


}
