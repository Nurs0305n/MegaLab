package kg.mega.library.mappers;

import kg.mega.library.models.Author;
import kg.mega.library.models.dto.AuthorDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Mapping(source = "authorId", target = "id")
    Author authorDtoToAuthor(AuthorDto authorDto);

    @Mapping(source = "id", target = "authorId")
    AuthorDto authorToAuthorDto(Author author);

}