package nurs.trainvoyage.services;

import nurs.trainvoyage.models.Voyage;
import nurs.trainvoyage.models.dto.VoyageCreateDto;

import java.util.List;

public interface VoyageService {
    VoyageCreateDto create(VoyageCreateDto voyageCreateDto);

    List<Voyage> findAll();
}
