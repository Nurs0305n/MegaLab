package kg.mega.trainflight.controllers;

import kg.mega.trainflight.models.Carriage;
import kg.mega.trainflight.sevices.impl.CarriageServiceImpl;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carriage")
public class CarriageController {

    private final CarriageServiceImpl carriageService;

    public CarriageController(CarriageServiceImpl carriageService) {
        this.carriageService = carriageService;
    }

    @GetMapping("/voyage/{voyageId}")
    public Carriage findCarriageByVoyage(@PathVariable Long voyageId) {
        return null;
    }

}
