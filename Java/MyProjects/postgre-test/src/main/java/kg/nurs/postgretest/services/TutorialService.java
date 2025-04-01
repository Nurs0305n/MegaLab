package kg.nurs.postgretest.services;

import kg.nurs.postgretest.models.Tutorial;

import java.util.List;

public interface TutorialService {
    Tutorial create(Tutorial tutorial);
    Tutorial update(Tutorial tutorial);
    void delete(Long id);
    Tutorial get(Long id);
    List<Tutorial> getAll();
    List<Tutorial> deleteAll();
    List<Tutorial> findAllPublished();
    List<Tutorial> findByTitleContainsKeyword(String keyword);
}
