package kg.mega.train_voyages.services;

import kg.mega.train_voyages.models.Passenger;
import kg.mega.train_voyages.models.dto.TicketBuyDto;

public interface PassengerService {

    Passenger create(TicketBuyDto ticketBuyDto);
}
