package kg.mega.trainflight.controllers;

import kg.mega.trainflight.models.Ticket;
import kg.mega.trainflight.models.dto.TicketBuyDto;
import kg.mega.trainflight.sevices.impl.TicketServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    private final TicketServiceImpl ticketService;

    public TicketController(TicketServiceImpl ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/buy")
    public ResponseEntity<?> buyTicket(@RequestBody TicketBuyDto ticketBuyDto) {
        Ticket ticket = ticketService.buyTicket(ticketBuyDto);
        return ResponseEntity.created(null).body(ticket);
    }

}
