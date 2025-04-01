package kg.mega.train_voyages.services.impl;

import kg.mega.train_voyages.models.Passenger;
import kg.mega.train_voyages.models.dto.TicketBuyDto;
import kg.mega.train_voyages.repositories.PassengerRepo;
import kg.mega.train_voyages.services.PassengerService;
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
        passenger.setAddress(ticketBuyDto.address());
        passenger.setPatronymic(ticketBuyDto.patronymic());

        return passengerRepo.save(passenger);
    }
}
