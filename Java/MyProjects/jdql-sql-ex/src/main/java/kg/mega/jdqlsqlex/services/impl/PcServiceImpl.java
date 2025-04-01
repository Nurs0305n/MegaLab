package kg.mega.jdqlsqlex.services.impl;

import kg.mega.jdqlsqlex.models.Pc;
import kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto;
import kg.mega.jdqlsqlex.repositories.PcRepo;
import kg.mega.jdqlsqlex.services.PcService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    private final PcRepo pcRepo;

    public PcServiceImpl(PcRepo pcRepo) {
        this.pcRepo = pcRepo;
    }

    @Override
    public List<ModelSpeedHdDto> findByPriceLessThan(double price) {
        List<ModelSpeedHdDto> modelSpeedHdDtos = pcRepo.findByPriceLessThan(price);

        return modelSpeedHdDtos;

    }

    @Override
    public List<ModelSpeedHdDto> findAllByCdInAndPriceLessThan(List<String> cd, double price) {
        List<ModelSpeedHdDto> modelSpeedHdDtos = pcRepo.findAllByCdInAndPriceLessThan(cd, price);

        return modelSpeedHdDtos;
    }

}
