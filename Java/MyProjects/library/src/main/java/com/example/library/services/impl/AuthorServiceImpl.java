package com.example.library.services.impl;

import com.example.library.mappers.AuthorMapper;
import com.example.library.models.Author;
import com.example.library.models.dto.AuthorDto;
import com.example.library.repositories.AuthorRepo;
import com.example.library.services.AuthorService;
import org.springframework.stereotype.Service;

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
}
