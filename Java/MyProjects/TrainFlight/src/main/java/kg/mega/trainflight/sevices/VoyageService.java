package kg.mega.trainflight.sevices;

import kg.mega.trainflight.models.Voyage;
import kg.mega.trainflight.models.dto.VoyageCreateDto;

import java.util.List;

public interface VoyageService {
    List<Voyage> getAll();

    VoyageCreateDto create(VoyageCreateDto voyageCreateDto);

    Voyage findById(long id);

    Voyage deleteById(long id);
}
