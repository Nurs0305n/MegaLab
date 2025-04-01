package com.example.library.mappers;

import com.example.library.models.Book;
import com.example.library.models.dto.BookDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "id", target = "bookId")
    BookDto bookToBookDto(Book book);
    @InheritInverseConfiguration
    Book bookDtoToBook(BookDto bookDto);
}
