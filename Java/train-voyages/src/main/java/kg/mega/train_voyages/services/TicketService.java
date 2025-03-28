package kg.mega.train_voyages.services;

import kg.mega.train_voyages.models.Ticket;
import kg.mega.train_voyages.models.dto.TicketBuyDto;

public interface TicketService {
    Ticket buyTicket(TicketBuyDto ticketBuyDto);
}
