package kg.mega.library.models.dto;

import java.util.List;

public record BookDto (Long bookId, String title, double price, List<AuthorDto> authorsDto) {
}
