package kg.mega.jdqlsqlex.repositories;

import kg.mega.jdqlsqlex.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {
    @Query("select u from Printer u where u.color = ?1")
    List<Printer> findAllByColor(char color);
}
