package com.example.library.models.dto;

import com.example.library.models.Author;

import java.util.List;

public record BookCreateDto(
        String title,
        List<Long> authorsIds
) {
}
