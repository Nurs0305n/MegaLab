package kg.mega.library.mappers;

import kg.mega.library.models.Author;
import kg.mega.library.models.Book;
import kg.mega.library.models.dto.BookCreateDto;
import kg.mega.library.models.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(target = "pricePerDay", source = "price")
    Book toBook(BookCreateDto bookCreateDto, List<Author> authors);

    @Mapping(source = "pricePerDay", target = "price")
    BookDto bookToBookDto(Book book);

}
