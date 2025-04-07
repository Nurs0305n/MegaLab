package kg.mega.library.services.impl;

import kg.mega.library.mappers.AuthorMapper;
import kg.mega.library.models.Author;
import kg.mega.library.models.dto.AuthorDto;
import kg.mega.library.repositories.AuthorRepo;
import kg.mega.library.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepo authorRepo;

    public AuthorServiceImpl(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public AuthorDto create(AuthorDto authorDto) {
        Author author = authorRepo.save(AuthorMapper.INSTANCE.authorDtoToAuthor(authorDto));
        return AuthorMapper.INSTANCE.authorToAuthorDto(author);
    }

//    @Override
//    public List<Author> findAuthorsByIds(List<Long> authorIds) {
//        return authorRepo.findAuthorsByIds(authorIds);
//    }

    @Override
    public List<Author> find(List<Long> authorIds) {
        return authorRepo.findAllById(authorIds);
    }
}
