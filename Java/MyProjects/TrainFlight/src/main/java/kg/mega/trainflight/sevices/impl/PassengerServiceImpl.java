package kg.mega.trainflight.sevices.impl;

import kg.mega.trainflight.models.Passenger;
import kg.mega.trainflight.models.dto.TicketBuyDto;
import kg.mega.trainflight.repositories.PassengerRepo;
import kg.mega.trainflight.sevices.PassengerService;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepo passengerRepo;

    public PassengerServiceImpl(PassengerRepo passengerRepo) {
        this.passengerRepo = passengerRepo;
    }

    @Override
    public Passenger create(TicketBuyDto ticketBuyDto) {
        Passenger passenger = new Passenger();
        passenger.setFirstName(ticketBuyDto.firstName());
        passenger.setLastName(ticketBuyDto.lastName());
        passenger.setPatronymics(ticketBuyDto.patronymic());
        passenger.setAddress(ticketBuyDto.address());
        return passengerRepo.save(passenger);
    }
}
