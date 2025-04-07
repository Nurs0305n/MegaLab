package kg.mega.library.services;

import kg.mega.library.models.Reader;
import kg.mega.library.models.dto.TicketDto;

public interface TicketService {
     TicketDto createTicketForReader(Reader reader);

     TicketDto findTicketDtoByReader(Reader reader);

     TicketDto reissue(Long readerId);
}
