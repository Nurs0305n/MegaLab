package kg.mega.trainflight.controllers;

import kg.mega.trainflight.models.dto.VoyageCreateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("/api/voyage")
public class VoyageController {

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VoyageCreateDto voyageCreateDto) {
        return ResponseEntity.ok(voyageCreateDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable long id) {
        VoyageCreateDto voyageCreateDto = new VoyageCreateDto(LocalDate.now(), LocalTime.now(), 1, 1, LocalDateTime.now(), 1, 300, 200);
        return ResponseEntity.ok(voyageCreateDto);
    }


}
