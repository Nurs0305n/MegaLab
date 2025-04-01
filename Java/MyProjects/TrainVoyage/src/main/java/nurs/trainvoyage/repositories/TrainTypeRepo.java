package nurs.trainvoyage.repositories;

import nurs.trainvoyage.models.TrainType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainTypeRepo extends JpaRepository<TrainType, Long> {
}
