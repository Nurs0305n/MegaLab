package kg.mega.jdqlsqlex.services;

import kg.mega.jdqlsqlex.models.Product;
import kg.mega.jdqlsqlex.models.dto.MakerDto;
import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;

import java.util.List;

public interface ProductService {
    List<MakerDto> findByType(String type);

}
