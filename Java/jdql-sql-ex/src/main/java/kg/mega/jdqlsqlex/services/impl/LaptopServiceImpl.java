package kg.mega.jdqlsqlex.services.impl;

import kg.mega.jdqlsqlex.models.Laptop;
import kg.mega.jdqlsqlex.models.dto.MakerDto;
import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;
import kg.mega.jdqlsqlex.models.dto.ModelRamScreen;
import kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto;
import kg.mega.jdqlsqlex.repositories.LaptopRepo;
import kg.mega.jdqlsqlex.services.LaptopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {
    private final LaptopRepo laptopRepo;

    public LaptopServiceImpl(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    @Override
    public List<ModelRamScreen> findByPrice(double price) {
        List<ModelRamScreen> modelRamScreens = laptopRepo.findAllByPriceGreaterThan(price);

        return modelRamScreens;
    }

    @Override
    public List<MakerSpeedDto> findByHd(double hd) {
        List<MakerSpeedDto> makerSpeedDtos = laptopRepo.findByHdGreaterThanEqual(hd);

        return makerSpeedDtos;
    }
}
