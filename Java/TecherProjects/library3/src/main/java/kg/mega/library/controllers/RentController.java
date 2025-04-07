package kg.mega.library.controllers;

import kg.mega.library.models.dto.RentCreateDto;
import kg.mega.library.models.dto.RentDto;
import kg.mega.library.services.RentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rent")
public class RentController {

    private final RentService rentService;

    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @PostMapping("/create")
    public RentDto rent(@RequestBody RentCreateDto rentCreateDto){
        return rentService.createRent(rentCreateDto);
    }
}
