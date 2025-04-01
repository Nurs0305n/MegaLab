package com.example.library.controllers;

import com.example.library.models.dto.BookCreateDto;
import com.example.library.models.dto.BookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @PostMapping("/create")
    public BookDto create(@RequestBody BookCreateDto bookCreateDto) {

        return null;
    }
}
