package kg.mega.train_voyages.controllers;

import kg.mega.train_voyages.models.Carriage;
import kg.mega.train_voyages.models.Voyage;
import kg.mega.train_voyages.models.dto.VoyageCreateDTO;
import kg.mega.train_voyages.services.VoyageService;
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
    public ResponseEntity<?> create(@RequestBody VoyageCreateDTO voyageCreateDTO){
        voyageCreateDTO = voyageService.create(voyageCreateDTO);
        return ResponseEntity.created(null).body(voyageCreateDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        VoyageCreateDTO voyageCreateDTO = new VoyageCreateDTO(
                LocalDate.now(),
                LocalTime.now(),
                1,
                2,
                LocalDateTime.now(),
                1,
                10000,
                400);

        return ResponseEntity.ok(voyageCreateDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        List<Voyage> voyages = voyageService.findAll();
        if (voyages.isEmpty())
            return ResponseEntity.noContent().build();


        return ResponseEntity.ok(voyages);
    }

    @GetMapping("/carriages/{voyageId}")
    public ResponseEntity<?> findCarriagesByVoyage(@PathVariable Long voyageId){
        List<Carriage> carriages = voyageService.findCarriagesByVoyageId(voyageId);
        return ResponseEntity.ok(carriages);
    }
}
