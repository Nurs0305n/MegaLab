package kg.mega.sqlexjpatest.repositories;

import kg.mega.sqlexjpatest.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {


}
