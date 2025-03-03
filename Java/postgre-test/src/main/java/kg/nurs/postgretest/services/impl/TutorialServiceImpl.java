package kg.nurs.postgretest.services.impl;

import kg.nurs.postgretest.models.Tutorial;
import kg.nurs.postgretest.repositories.TutorialRepo;
import kg.nurs.postgretest.services.TutorialService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImpl implements TutorialService {

    private final TutorialRepo tutorialRepo;

    public TutorialServiceImpl(TutorialRepo tutorialRepo) {
        this.tutorialRepo = tutorialRepo;
    }

    @Override
    public Tutorial create(Tutorial tutorial) {
        return tutorialRepo.save(tutorial);
    }

    @Override
    public Tutorial update(Tutorial tutorial) {
        return tutorialRepo.save(tutorial);
    }

    @Override
    public void delete(Long id) {
        tutorialRepo.deleteById(id);
    }

    @Override
    public Tutorial get(Long id) {
        return tutorialRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Tutorial> getAll() {
        return (List<Tutorial>) tutorialRepo.findAll();
    }

    @Override
    public List<Tutorial> deleteAll() {
        List<Tutorial> tutorials = (List<Tutorial>) tutorialRepo.findAll();
        tutorialRepo.deleteAll();
        return tutorials;
    }

    @Override
    public List<Tutorial> findAllPublished() {
        List<Tutorial> tutorials = getAll();

        for (int i = 0; i < tutorials.size(); i++) {
            if (!tutorials.get(i).isPublished()) {
                tutorials.remove(i);
            }
        }

        return tutorials;
    }

    @Override
    public List<Tutorial> findByTitleContainsKeyword(String keyword) {
        List<Tutorial> tutorials = getAll();

        for (int i = 0; i < tutorials.size(); i++) {
            if (!tutorials.get(i).getTitle().contains(keyword)) {
                tutorials.remove(i);
            }
        }


        return tutorials;
    }
}
