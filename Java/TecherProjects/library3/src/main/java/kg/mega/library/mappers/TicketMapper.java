package kg.mega.library.mappers;

import kg.mega.library.models.Ticket;
import kg.mega.library.models.dto.TicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TicketMapper {

    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

    @Mapping(target = "expiredDate", source = "endDate")
    TicketDto ticketToTicketDto(Ticket ticket);

}
