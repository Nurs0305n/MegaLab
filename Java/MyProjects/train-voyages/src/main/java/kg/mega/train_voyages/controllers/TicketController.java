package kg.mega.train_voyages.controllers;

import kg.mega.train_voyages.models.Ticket;
import kg.mega.train_voyages.models.dto.TicketBuyDto;
import kg.mega.train_voyages.services.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/buy")
    public ResponseEntity<?> buyTicket(@RequestBody TicketBuyDto ticketBuyDto){
        Ticket ticket = ticketService.buyTicket(ticketBuyDto);
        return ResponseEntity.created(null).body(ticket);
    }
}
