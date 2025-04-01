package kg.mega.library.services.impl;

import kg.mega.library.mappers.BookMapper;
import kg.mega.library.models.Author;
import kg.mega.library.models.Book;
import kg.mega.library.models.dto.BookCreateDto;
import kg.mega.library.models.dto.BookDto;
import kg.mega.library.repositories.BookRepo;
import kg.mega.library.services.AuthorService;
import kg.mega.library.services.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;
    private final AuthorService authorService;

    public BookServiceImpl(BookRepo bookRepo, AuthorService authorService) {
        this.bookRepo = bookRepo;
        this.authorService = authorService;
    }

    @Override
    public BookDto create(BookCreateDto bookCreateDto) {
        List<Author> authors = authorService.findAuthorsByIds(bookCreateDto.authorIds());
        Book book = BookMapper.INSTANCE.toBook(bookCreateDto, authors);

        book = bookRepo.save(book);

        return BookMapper.INSTANCE.bookToBookDto(book);
    }
}
