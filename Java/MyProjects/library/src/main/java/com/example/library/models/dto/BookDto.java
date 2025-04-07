package com.example.library.models.dto;

import com.example.library.models.Author;

import java.util.List;

public record BookDto(
        Long bookId,
        String title,
        double price,
        List<Author> authors
) {
}
