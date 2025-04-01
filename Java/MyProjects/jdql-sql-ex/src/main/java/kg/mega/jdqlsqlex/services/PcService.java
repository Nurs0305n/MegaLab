package kg.mega.jdqlsqlex.services;

import kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto;

import java.util.List;

public interface PcService {
    List<ModelSpeedHdDto> findByPriceLessThan(double price);


    List<ModelSpeedHdDto> findAllByCdInAndPriceLessThan(List<String> cd, double price);

}
