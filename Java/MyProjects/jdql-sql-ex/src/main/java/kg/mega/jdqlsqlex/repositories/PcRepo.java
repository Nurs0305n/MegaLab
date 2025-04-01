package kg.mega.jdqlsqlex.repositories;

import kg.mega.jdqlsqlex.models.Pc;
import kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {
    @Query("select new kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto(u.product.model, u.speed, u.hd) u from Pc u where u.price < :price")
    List<ModelSpeedHdDto> findByPriceLessThan(double price);

    @Query("select new kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto(u.product.model, u.speed, u.hd) u from Pc u where u.cd in ?1 and u.price < ?2")
    List<ModelSpeedHdDto> findAllByCdInAndPriceLessThan(List<String> cd, double price);
}
