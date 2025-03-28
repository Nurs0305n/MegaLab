package kg.mega.train_voyages.services;

import kg.mega.train_voyages.models.Carriage;
import kg.mega.train_voyages.models.Voyage;
import kg.mega.train_voyages.models.dto.VoyageCreateDTO;

import java.util.List;

public interface VoyageService {
    VoyageCreateDTO create(VoyageCreateDTO voyageCreateDTO);

    Voyage findById(Long id);
    List<Voyage> findAll();

    List<Carriage> findCarriagesByVoyageId(Long voyageId);
}
