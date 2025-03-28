package kg.mega.train_voyages.repositories;

import kg.mega.train_voyages.models.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRepo extends JpaRepository<Locality, Long> {
}
