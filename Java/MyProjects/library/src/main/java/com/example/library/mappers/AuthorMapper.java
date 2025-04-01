package com.example.library.mappers;

import com.example.library.models.Author;
import com.example.library.models.dto.AuthorDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Mapping(source = "id", target = "authorId")
    AuthorDto authorToAuthorDto(Author author);

    @InheritInverseConfiguration
    Author authorDtoToAuthor(AuthorDto authorDto);

}
