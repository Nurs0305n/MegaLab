package kg.mega.trainflight.controllers;

import kg.mega.trainflight.models.Voyage;
import kg.mega.trainflight.models.dto.VoyageCreateDto;
import kg.mega.trainflight.repositories.VoyageRepo;
import kg.mega.trainflight.sevices.VoyageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/voyage")
public class VoyageController {

    private final VoyageService voyageService;

    public VoyageController(VoyageService voyageService) {
        this.voyageService = voyageService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VoyageCreateDto voyageCreateDto) {
        voyageService.create(voyageCreateDto);
        return ResponseEntity.ok(voyageCreateDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable long id) {
        VoyageCreateDto voyageCreateDto = new VoyageCreateDto(LocalDate.now(), LocalTime.now(), 1, 1, LocalDateTime.now(), 1, 300, 200);
        return ResponseEntity.ok(voyageCreateDto);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        List<Voyage> voyages = voyageService.getAll();
        return ResponseEntity.ok(voyages);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        
        return voyageCreateDto
    }

}
