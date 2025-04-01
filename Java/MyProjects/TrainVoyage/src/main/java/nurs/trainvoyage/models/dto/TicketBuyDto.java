package nurs.trainvoyage.models.dto;

public record TicketBuyDto(
        String firstName,
        String lastName,
        String address,
        String patronymic,
        Long voyageId,
        Long carriageId
) {
}
