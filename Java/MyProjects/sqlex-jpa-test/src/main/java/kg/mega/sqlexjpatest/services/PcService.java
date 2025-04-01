package kg.mega.sqlexjpatest.services;

import kg.mega.sqlexjpatest.models.dto.ModelSpeedHdDto;

import java.util.List;

public interface PcService {
    List<ModelSpeedHdDto> findByPricesLessThan(double price);
}
