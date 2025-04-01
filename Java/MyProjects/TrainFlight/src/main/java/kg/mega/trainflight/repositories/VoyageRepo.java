package kg.mega.trainflight.repositories;

import kg.mega.trainflight.models.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageRepo extends JpaRepository<Voyage, Long> {
}
