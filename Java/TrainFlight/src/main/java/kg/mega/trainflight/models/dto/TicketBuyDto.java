package kg.mega.trainflight.models.dto;

import kg.mega.trainflight.models.Carriage;
import kg.mega.trainflight.models.Voyage;

public record TicketBuyDto(
        String firstName,
        String lastName,
        String patronymic,
        String address,
        Long voyageId,
        Long carriageId
) {
}
