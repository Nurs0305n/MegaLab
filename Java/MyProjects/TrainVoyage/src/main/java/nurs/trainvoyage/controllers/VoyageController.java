package nurs.trainvoyage.controllers;

import nurs.trainvoyage.models.Voyage;
import nurs.trainvoyage.models.dto.VoyageCreateDto;
import nurs.trainvoyage.services.impl.VoyageServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/voyage")
public class VoyageController {

    private final VoyageServiceImpl voyageService;

    public VoyageController(VoyageServiceImpl voyageService) {
        this.voyageService = voyageService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VoyageCreateDto voyageCreateDto) {
        voyageService.create(voyageCreateDto);
        return ResponseEntity.ok(voyageCreateDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable long id) {
        VoyageCreateDto voyageCreateDto = new VoyageCreateDto(
                LocalDate.now(),
                LocalTime.now(),
                1,
                1,
                LocalDateTime.now(),
                1,
                50,
                50
        );
        return ResponseEntity.ok(voyageCreateDto);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        List<Voyage> voyages = voyageService.findAll();
        if (voyages.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(voyages);
    }

}
