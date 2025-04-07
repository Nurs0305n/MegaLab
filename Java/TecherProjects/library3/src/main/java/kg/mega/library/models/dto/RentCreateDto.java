package kg.mega.library.models.dto;

public record RentCreateDto(Long readerId, Long bookId, int daysCount) {
}
