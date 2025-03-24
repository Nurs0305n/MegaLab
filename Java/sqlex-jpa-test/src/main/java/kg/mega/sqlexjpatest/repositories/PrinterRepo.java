package kg.mega.sqlexjpatest.repositories;

import kg.mega.sqlexjpatest.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {


}
