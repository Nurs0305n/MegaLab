package nurs.trainvoyage.services.impl;

import nurs.trainvoyage.models.Voyage;
import nurs.trainvoyage.models.dto.VoyageCreateDto;
import nurs.trainvoyage.repositories.VoyageRepo;
import nurs.trainvoyage.services.VoyageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoyageServiceImpl implements VoyageService {

    private final VoyageRepo voyageRepo;
    private final LocalityServiceImpl localityService;
    private final TrainServiceImpl trainService;

    public VoyageServiceImpl(VoyageRepo voyageRepo, LocalityServiceImpl localityService, TrainServiceImpl trainService) {
        this.voyageRepo = voyageRepo;
        this.localityService = localityService;
        this.trainService = trainService;
    }

    @Override
    public VoyageCreateDto create(VoyageCreateDto voyageCreateDto) {
        Voyage voyage = new Voyage();
        voyage.setSendDate(voyageCreateDto.sendDate());
        voyage.setSendTime(voyageCreateDto.sendTime());
        voyage.setDestinationLocality(localityService.findById(voyageCreateDto.destinationPointId()));
        voyage.setStartingLocality(localityService.findById(voyageCreateDto.startPointId()));
        voyage.setArrivalTime(voyageCreateDto.arrivalDate());
        voyage.setTrain(trainService.findById(voyageCreateDto.trainId()));
        voyage.setDistance(voyageCreateDto.distance());
        voyage.setPrice(voyageCreateDto.price());
        voyageRepo.save(voyage);

        return voyageCreateDto;
    }

    @Override
    public List<Voyage> findAll() {
        List<Voyage> voyages = voyageRepo.findAll();
        return voyages;
    }
}
