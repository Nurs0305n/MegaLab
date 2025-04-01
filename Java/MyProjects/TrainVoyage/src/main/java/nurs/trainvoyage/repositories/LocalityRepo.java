package nurs.trainvoyage.repositories;

import nurs.trainvoyage.models.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRepo extends JpaRepository<Locality, Long> {

}
