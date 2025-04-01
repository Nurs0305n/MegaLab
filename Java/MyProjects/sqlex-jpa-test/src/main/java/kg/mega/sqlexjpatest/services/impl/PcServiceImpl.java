package kg.mega.sqlexjpatest.services.impl;

import kg.mega.sqlexjpatest.models.dto.ModelSpeedHdDto;
import kg.mega.sqlexjpatest.repositories.PcRepo;
import kg.mega.sqlexjpatest.services.PcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PcServiceImpl implements PcService {
    private final PcRepo pcRepo;

    public PcServiceImpl(PcRepo pcRepo) {
        this.pcRepo = pcRepo;
    }

    @Override
    public List<ModelSpeedHdDto> findByPricesLessThan(double price) {
        List<ModelSpeedHdDto> modelSpeedHdDtos = pcRepo.findByPriceLessThan(price);
        return modelSpeedHdDtos;
    }
}
