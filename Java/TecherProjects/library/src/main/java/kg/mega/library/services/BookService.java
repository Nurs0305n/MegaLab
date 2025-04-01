package kg.mega.library.services;

import kg.mega.library.models.dto.BookCreateDto;
import kg.mega.library.models.dto.BookDto;

public interface BookService {
    BookDto create(BookCreateDto bookCreateDto);
}
