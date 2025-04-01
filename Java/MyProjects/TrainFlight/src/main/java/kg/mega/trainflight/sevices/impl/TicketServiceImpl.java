package kg.mega.trainflight.sevices.impl;

import kg.mega.trainflight.models.Carriage;
import kg.mega.trainflight.models.Passenger;
import kg.mega.trainflight.models.Ticket;
import kg.mega.trainflight.models.Voyage;
import kg.mega.trainflight.models.dto.TicketBuyDto;
import kg.mega.trainflight.sevices.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final VoyageServiceImpl voyageService;
    private final CarriageServiceImpl carriageService;
    private final PassengerServiceImpl passengerService;

    public TicketServiceImpl(VoyageServiceImpl voyageService, CarriageServiceImpl carriageService, PassengerServiceImpl passengerService) {
        this.voyageService = voyageService;
        this.carriageService = carriageService;
        this.passengerService = passengerService;
    }


    @Override
    public Ticket buyTicket(TicketBuyDto ticketBuyDto) {
        Voyage voyage = voyageService.findById(ticketBuyDto.voyageId());
        Carriage carriage = carriageService.findById(ticketBuyDto.carriageId());
        Passenger passenger = passengerService.create(ticketBuyDto);
        return null;
    }
}
