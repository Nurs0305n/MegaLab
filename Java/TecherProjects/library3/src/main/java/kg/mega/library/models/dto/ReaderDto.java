package kg.mega.library.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

public record ReaderDto(
        Long id,
        String firstName,
        String lastName,
        String address,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate dateOfBirth,
        String ticketNumber,
        @JsonFormat(pattern = "dd.MM.yyyy")
        LocalDate expiredDate
) {

    public ReaderDto(Long id,
                     String firstName,
                     String lastName,
                     String address,
                     Date dateOfBirth,
                     String ticketNumber,
                     Date startDate,
                     Date expiredDate
                     ){
        this(id, firstName, lastName, address, dateOfBirth.toLocalDate(), ticketNumber, expiredDate.toLocalDate());
    }
}
