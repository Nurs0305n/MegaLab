package com.example.library.controllers;

import com.example.library.models.dto.ReaderCreateDto;
import com.example.library.models.dto.ReaderDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/reader")
public class ReaderController {

    public ReaderDto create(@RequestBody ReaderCreateDto readerCreateDto) {
        return null;
    }
}
