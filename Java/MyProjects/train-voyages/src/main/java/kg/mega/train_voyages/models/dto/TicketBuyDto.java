package kg.mega.train_voyages.models.dto;

public record TicketBuyDto(
        String firstName,
        String lastName,
        String patronymic,
        String address,
        Long voyageId,
        Long carriageId
) {


}
