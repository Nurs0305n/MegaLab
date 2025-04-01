package kg.mega.train_voyages.services.impl;

import kg.mega.train_voyages.models.*;
import kg.mega.train_voyages.models.dto.TicketBuyDto;
import kg.mega.train_voyages.repositories.CarriageRepo;
import kg.mega.train_voyages.repositories.TicketRepo;
import kg.mega.train_voyages.services.*;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepo ticketRepo;
    private final VoyageService voyageService;
    private final CarriageService carriageService;
    private final PassengerService passengerService;

    public TicketServiceImpl(TicketRepo ticketRepo, VoyageService voyageService, CarriageService carriageService, PassengerService passengerService) {
        this.ticketRepo = ticketRepo;
        this.voyageService = voyageService;
        this.carriageService = carriageService;
        this.passengerService = passengerService;
    }

    @Override
    public Ticket buyTicket(TicketBuyDto ticketBuyDto) {
        Voyage voyage = voyageService.findById(ticketBuyDto.voyageId());
        Carriage carriage = carriageService.findById(ticketBuyDto.carriageId());
        Passenger passenger = passengerService.create(ticketBuyDto);

        Ticket ticket = new Ticket();
        ticket.setCarriage(carriage);
        ticket.setPassenger(passenger);
        ticket.setVoyage(voyage);
        ticket.setPrice(voyage.getPrice() + carriage.getCarriageType().getExtraPrice());

        return ticketRepo.save(ticket);
    }
}
