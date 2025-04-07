package com.example.library.mappers;

import com.example.library.models.Author;
import com.example.library.models.Book;
import com.example.library.models.dto.BookCreateDto;
import com.example.library.models.dto.BookDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

        com.example.library.mappers.BookMapper INSTANCE = Mappers.getMapper(com.example.library.mappers.BookMapper.class);

        @Mapping(source = "id", target = "bookId")
        BookDto bookToBookDto(Book book);
        @InheritInverseConfiguration
        Book bookDtoToBook(BookDto bookDto);

        @Mapping(source = "bookCreateDto.price", target = "price")
        Book toBook(BookCreateDto bookCreateDto, List<Author> authors);

        BookDto toBookDto(Book book);
}
