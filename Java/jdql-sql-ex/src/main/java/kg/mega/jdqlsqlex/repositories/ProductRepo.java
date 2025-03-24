package kg.mega.jdqlsqlex.repositories;

import kg.mega.jdqlsqlex.models.Product;
import kg.mega.jdqlsqlex.models.dto.MakerDto;
import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Query("select distinct new kg.mega.jdqlsqlex.models.dto.MakerDto(u.maker) u from Product u where u.type = :type")
    List<MakerDto> findByType(String type);

}
