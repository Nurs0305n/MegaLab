package kg.mega.library.controllers;

import kg.mega.library.models.dto.BookCreateDto;
import kg.mega.library.models.dto.BookDto;
import kg.mega.library.services.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/create")
    public BookDto create(@RequestBody BookCreateDto bookCreateDto){
        return bookService.create(bookCreateDto);
    }
}
