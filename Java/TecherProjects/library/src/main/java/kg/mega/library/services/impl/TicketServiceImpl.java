package kg.mega.library.services.impl;

import kg.mega.library.enums.TicketStatus;
import kg.mega.library.mappers.TicketMapper;
import kg.mega.library.models.Reader;
import kg.mega.library.models.Ticket;
import kg.mega.library.models.dto.TicketDto;
import kg.mega.library.repositories.TicketRepo;
import kg.mega.library.services.ReaderService;
import kg.mega.library.services.TicketService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepo ticketRepo;

    public TicketServiceImpl(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    @Override
    public TicketDto createTicketForReader(Reader reader) {

        Ticket ticket = new Ticket();
        ticket.setReader(reader);
        ticket.setStartDate(LocalDate.now());
        ticket.setEndDate(LocalDate.now().plusYears(1));
        ticket.setTicketNumber(generateTicketNumber());
        ticket.setStatus(TicketStatus.OPEN);

        ticket = ticketRepo.save(ticket);

        return TicketMapper.INSTANCE.ticketToTicketDto(ticket);
    }

    private String generateTicketNumber() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm-MS");
        return sdf.format(now);
    }

    @Override
    public TicketDto findTicketDtoByReader(Reader reader) {
        Ticket ticket = ticketRepo.findByReaderAndStatus(reader, TicketStatus.OPEN);
        return TicketMapper.INSTANCE.ticketToTicketDto(ticket);
    }

    @Override
    public TicketDto reissue(Long readerId) {

        Ticket ticket = ticketRepo.findByReaderIdAndStatus(readerId, TicketStatus.OPEN);

        if (ticket != null){
            ticket.setStatus(TicketStatus.CLOSED);
            ticket.setEndDate(LocalDate.now());
            ticket = ticketRepo.save(ticket);
        }

        Reader reader = new Reader();
        reader.setId(readerId);

        return createTicketForReader(reader);
    }
}
