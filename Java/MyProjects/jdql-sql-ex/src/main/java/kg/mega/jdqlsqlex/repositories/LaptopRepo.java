package kg.mega.jdqlsqlex.repositories;

import kg.mega.jdqlsqlex.models.Laptop;
import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;
import kg.mega.jdqlsqlex.models.dto.ModelRamScreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {
    @Query("select new kg.mega.jdqlsqlex.models.dto.ModelRamScreen(u.product.model, u.ram, u.screen) u from Laptop u where u.price > :pr")
    List<ModelRamScreen> findAllByPriceGreaterThan(@Param("pr") double price);


    @Query("select distinct new kg.mega.jdqlsqlex.models.dto.MakerSpeedDto(u.product.maker, u.speed) from Laptop u where u.hd >= :hd")
    List<MakerSpeedDto> findByHdGreaterThanEqual(double hd);

}
