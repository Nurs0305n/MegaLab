package kg.mega.jdqlsqlex.services;

import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;
import kg.mega.jdqlsqlex.models.dto.ModelRamScreen;

import java.util.List;

public interface LaptopService {
    List<ModelRamScreen> findByPrice(double price);

    List<MakerSpeedDto> findByHd(double hd);
}
