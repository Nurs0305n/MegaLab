package kg.mega.library.models.dto;

import java.util.List;

public record BookCreateDto(
        String title,
        double price,
        List<Long> authorIds) {
}
