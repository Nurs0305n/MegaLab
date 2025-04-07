package kg.mega.library.mappers;

import kg.mega.library.models.Reader;
import kg.mega.library.models.dto.ReaderCreateDto;
import kg.mega.library.models.dto.ReaderDto;
import kg.mega.library.models.dto.ReaderUpdateDto;
import kg.mega.library.models.dto.TicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReaderMapper {

    ReaderMapper INSTANCE = Mappers.getMapper(ReaderMapper.class);

    Reader readerCreateDtoToReader(ReaderCreateDto readerCreateDto);

    @Mapping(source = "ticketDto.ticketNumber", target = "ticketNumber")
    @Mapping(source = "ticketDto.expiredDate", target = "expiredDate")
    ReaderDto readerAndTicketDtoToReaderDto(Reader reader, TicketDto ticketDto);

    @Mapping(source = "readerId", target = "id")
    Reader readerUpdateDtoToReader(ReaderUpdateDto readerUpdateDto);

}
