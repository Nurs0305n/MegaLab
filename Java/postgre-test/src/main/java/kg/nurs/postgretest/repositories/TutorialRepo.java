package kg.nurs.postgretest.repositories;

import kg.nurs.postgretest.models.Tutorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepo extends CrudRepository<Tutorial, Long> {
}
