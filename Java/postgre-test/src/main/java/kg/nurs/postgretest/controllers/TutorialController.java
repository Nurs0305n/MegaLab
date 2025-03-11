package kg.nurs.postgretest.controllers;

import kg.nurs.postgretest.models.Tutorial;
import kg.nurs.postgretest.services.impl.TutorialServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tutorial")
public class TutorialController {

    private final TutorialServiceImpl tutorialService;

    public TutorialController(TutorialServiceImpl tutorialService) {
        this.tutorialService = tutorialService;
    }

    @GetMapping("/{id}")
    public Tutorial getTutorial(@PathVariable Long id) {
        return tutorialService.get(id);
    }
    
    @PostMapping("/create")
    public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
        return tutorialService.create(tutorial);
    }
    
    @PutMapping("/update")
    public Tutorial updateTutorial(@RequestBody Tutorial tutorial) {
        return tutorialService.update(tutorial);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteTutorial(@PathVariable Long id) {
        tutorialService.delete(id);
    }
    
    @GetMapping("/all")
    public Iterable<Tutorial> getAllTutorials() {
        return tutorialService.getAll();
    }
    
    @GetMapping("/published")
    public Iterable<Tutorial> getAllPublishedTutorials() {
        return tutorialService.findAllPublished();
    }
    
    @GetMapping("/search/{keyword}")
    public Iterable<Tutorial> searchTutorialsByKeyword(@PathVariable String keyword) {
        return tutorialService.findByTitleContainsKeyword(keyword);
    }
    
    @DeleteMapping("/delete-all")
    public Iterable<Tutorial> deleteAllTutorials() {
        return tutorialService.deleteAll();
    }
    
    

}
