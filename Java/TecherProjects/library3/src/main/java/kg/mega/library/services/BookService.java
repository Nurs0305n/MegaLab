package kg.mega.library.services;

import kg.mega.library.models.Book;
import kg.mega.library.models.dto.BookCreateDto;
import kg.mega.library.models.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto create(BookCreateDto bookCreateDto);

    List<BookDto> findBooks(int pageNo, int pageSize);

    Book findById(Long bookId);
}
