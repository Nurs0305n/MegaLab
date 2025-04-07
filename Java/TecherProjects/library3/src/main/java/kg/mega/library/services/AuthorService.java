package kg.mega.library.services;

import kg.mega.library.models.Author;
import kg.mega.library.models.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    AuthorDto create(AuthorDto authorDto);

    List<Author> find(List<Long> authorIds);
}
