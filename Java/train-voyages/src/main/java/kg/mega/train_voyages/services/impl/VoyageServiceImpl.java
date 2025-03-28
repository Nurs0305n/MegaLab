package kg.mega.train_voyages.services.impl;

import kg.mega.train_voyages.models.Carriage;
import kg.mega.train_voyages.models.Voyage;
import kg.mega.train_voyages.models.dto.VoyageCreateDTO;
import kg.mega.train_voyages.repositories.VoyageRepo;
import kg.mega.train_voyages.services.LocalityService;
import kg.mega.train_voyages.services.TrainService;
import kg.mega.train_voyages.services.VoyageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoyageServiceImpl implements VoyageService {

    private final VoyageRepo voyageRepo;
    private final LocalityService localityService;
    private final TrainService trainService;

    public VoyageServiceImpl(VoyageRepo voyageRepo, LocalityService localityService, TrainService trainService) {
        this.voyageRepo = voyageRepo;
        this.localityService = localityService;
        this.trainService = trainService;
    }

    @Override
    public VoyageCreateDTO create(VoyageCreateDTO voyageCreateDTO) {
        Voyage voyage = new Voyage();
        voyage.setDestination(localityService.findById(voyageCreateDTO.destinationPointId()));
        voyage.setStartingPoint(localityService.findById(voyageCreateDTO.startPointId()));
        voyage.setDistance(voyageCreateDTO.distance());
        voyage.setPrice(voyageCreateDTO.price());
        voyage.setSendDate(voyageCreateDTO.sendDate());
        voyage.setSendTime(voyageCreateDTO.sendTime());
        voyage.setArrivalTime(voyageCreateDTO.arrivalDate());
        voyage.setTrain(trainService.findById(voyageCreateDTO.trainId()));

        voyage = voyageRepo.save(voyage);

        return voyageCreateDTO;
    }

    @Override
    public Voyage findById(Long id) {
        return voyageRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Voyage> findAll() {
        return voyageRepo.findAll();
    }

    @Override
    public List<Carriage> findCarriagesByVoyageId(Long voyageId) {
        Voyage voyage = findById(voyageId);
        List<Carriage> carriages = voyage.getTrain().getCarriages();
        return carriages;
    }
}
