package kg.mega.sqlexjpatest.repositories;

import kg.mega.sqlexjpatest.models.Product;
import kg.mega.sqlexjpatest.models.dto.ModelSpeedHdDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Product, Integer> {
    @Query("select new kg.mega.sqlexjpatest.models.dto.ModelSpeedHdDto(u.product.model, u.speed, u.hd) u from Pc u where u.price < :price")
    List<ModelSpeedHdDto> findByPriceLessThan(double price);
}
