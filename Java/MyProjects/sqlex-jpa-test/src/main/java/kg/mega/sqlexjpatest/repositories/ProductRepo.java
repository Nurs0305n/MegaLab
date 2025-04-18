package kg.mega.sqlexjpatest.repositories;

import kg.mega.sqlexjpatest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
