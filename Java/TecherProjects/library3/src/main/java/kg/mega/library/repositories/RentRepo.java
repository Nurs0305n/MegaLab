package kg.mega.library.repositories;

import kg.mega.library.models.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepo extends JpaRepository<Rent, Long> {
}
