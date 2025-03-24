package kg.mega.jdqlsqlex.services.impl;

import kg.mega.jdqlsqlex.models.Product;
import kg.mega.jdqlsqlex.models.dto.MakerDto;
import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;
import kg.mega.jdqlsqlex.repositories.ProductRepo;
import kg.mega.jdqlsqlex.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    public final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<MakerDto> findByType(String type) {
        List<MakerDto> makerDtos = productRepo.findByType(type);
        return makerDtos;
    }

}
