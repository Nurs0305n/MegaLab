package com.example.library.mappers;

import com.example.library.models.Reader;
import com.example.library.models.dto.ReaderCreateDto;
import com.example.library.models.dto.ReaderDto;
import com.example.library.models.dto.ReaderUpdateDto;
import com.example.library.models.dto.TicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReaderMapper {
    ReaderMapper INSTANCE = Mappers.getMapper(ReaderMapper.class);

    Reader readerCreateDtoToReader(ReaderCreateDto readerCreateDto);

    @Mapping(source = "ticketDto.tickerNumber", target = "ticketNumber")
    @Mapping(source = "ticketDto.expiredDate", target = "expiredDate")
    ReaderDto readerAndTicketDtoToReaderDto(Reader reader, TicketDto ticketDto);

    @Mapping(source = "readerId", target = "id")
    Reader readerUpdateDtoToReader(ReaderUpdateDto readerUpdateDto);
}
