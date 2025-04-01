package kg.mega.train_voyages.repositories;

import kg.mega.train_voyages.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepo extends JpaRepository<Train, Long> {
}
