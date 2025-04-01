package nurs.trainvoyage.repositories;

import nurs.trainvoyage.models.Carriage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarriageRepo extends JpaRepository<Carriage, Long> {
}
