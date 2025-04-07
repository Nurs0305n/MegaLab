package kg.mega.library.repositories;

import kg.mega.library.enums.TicketStatus;
import kg.mega.library.models.Reader;
import kg.mega.library.models.dto.ReaderDto;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReaderRepo extends JpaRepository<Reader, Long> {

    @Query(value = "select new kg.mega.library.models.dto.ReaderDto(u.reader.id, u.reader.firstName, u.reader.lastName, u.reader.address, u.reader.dateOfBirth, u.ticketNumber, u.endDate) from Ticket u where u.endDate > ?1")
    List<ReaderDto> findReaderDtos(LocalDate localDate);

    @Query(value = "select new kg.mega.library.models.dto.ReaderDto(u.reader.id, u.reader.firstName, u.reader.lastName, u.reader.address, u.reader.dateOfBirth, u.ticketNumber, u.endDate) from Ticket u where u.endDate > ?1")
    List<ReaderDto> findReaderDtos(LocalDate localDate, Pageable pageable);


    @Query(value = "select r.id, r.first_name, r.last_name, r.address, r.date_of_birth, t.ticket_number, t.start_date, t.end_date from readers r join tickets t on r.id = t.reader_id  where t.end_date > ?1", nativeQuery = true)
    List<ReaderDto> findReaderDtosNative(LocalDate localDate);

    @Query(value = "select r.id, r.first_name, r.last_name, r.address, r.date_of_birth, t.ticket_number, t.start_date, t.end_date from readers r join tickets t on r.id = t.reader_id  where t.end_date > ?1", nativeQuery = true)
    List<ReaderDto> findReaderDtosNative(LocalDate localDate, Pageable pageable);
}
