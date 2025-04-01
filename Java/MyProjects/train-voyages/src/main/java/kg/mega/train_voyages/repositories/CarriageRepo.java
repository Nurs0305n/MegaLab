package kg.mega.train_voyages.repositories;

import kg.mega.train_voyages.models.Carriage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarriageRepo extends JpaRepository<Carriage, Long> {
}
