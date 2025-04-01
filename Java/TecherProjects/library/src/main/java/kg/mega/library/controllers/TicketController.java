package kg.mega.library.controllers;

import kg.mega.library.models.dto.TicketDto;
import kg.mega.library.services.TicketService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    public final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    @PutMapping("/reissue")
    public TicketDto reissue(@RequestParam Long readerId){
        return ticketService.reissue(readerId);
    }
}
