package kg.mega.train_voyages.repositories;

import kg.mega.train_voyages.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long> {
}
