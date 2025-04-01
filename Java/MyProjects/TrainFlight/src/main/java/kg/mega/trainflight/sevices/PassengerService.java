package kg.mega.trainflight.sevices;

import kg.mega.trainflight.models.Passenger;
import kg.mega.trainflight.models.dto.TicketBuyDto;

public interface PassengerService {
    Passenger create(TicketBuyDto ticketBuyDto);
}
