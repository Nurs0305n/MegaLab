package kg.mega.library.repositories;

import kg.mega.library.enums.TicketStatus;
import kg.mega.library.models.Reader;
import kg.mega.library.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Long> {


    Ticket findByReaderAndStatus(Reader reader, TicketStatus status);

    @Query("select u from Ticket u where u.reader.id = :readerId and u.status = :status")
    Ticket findByReaderIdAndStatus(Long readerId, TicketStatus status);


}
