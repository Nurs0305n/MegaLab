package kg.mega.trainflight.repositories;

import kg.mega.trainflight.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepo extends JpaRepository<Train, Long> {
}
