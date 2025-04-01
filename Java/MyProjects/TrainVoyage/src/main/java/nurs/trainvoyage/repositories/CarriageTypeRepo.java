package nurs.trainvoyage.repositories;

import nurs.trainvoyage.models.CarriageType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarriageTypeRepo extends JpaRepository<CarriageType, Long> {
}
