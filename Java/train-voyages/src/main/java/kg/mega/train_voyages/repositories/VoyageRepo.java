package kg.mega.train_voyages.repositories;

import kg.mega.train_voyages.models.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageRepo extends JpaRepository<Voyage, Long> {
}
