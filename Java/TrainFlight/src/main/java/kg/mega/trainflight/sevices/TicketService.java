package kg.mega.trainflight.sevices;

import kg.mega.trainflight.models.Ticket;
import kg.mega.trainflight.models.dto.TicketBuyDto;

public interface TicketService {
    Ticket buyTicket(TicketBuyDto ticketBuyDto);
}
