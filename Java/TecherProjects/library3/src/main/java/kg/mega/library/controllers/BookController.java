package kg.mega.library.controllers;

import kg.mega.library.models.Book;
import kg.mega.library.models.dto.BookCreateDto;
import kg.mega.library.models.dto.BookDto;
import kg.mega.library.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getExample")
    public BookCreateDto getExample(@RequestParam List<Long> ids){
        return new BookCreateDto("Чудное мгновение", 20,ids);
    }

    @PostMapping("/create")
    public BookDto create(@RequestBody BookCreateDto bookCreateDto){
        return bookService.create(bookCreateDto);
    }

    @GetMapping("/list")
    public List<BookDto> findBooks(@RequestParam int pageNo, @RequestParam int pageSize){

        return bookService.findBooks(pageNo, pageSize);
    }
}
