package kg.mega.trainflight.sevices.impl;

import kg.mega.trainflight.models.Voyage;
import kg.mega.trainflight.models.dto.VoyageCreateDto;
import kg.mega.trainflight.repositories.VoyageRepo;
import kg.mega.trainflight.sevices.LocalityService;
import kg.mega.trainflight.sevices.TrainService;
import kg.mega.trainflight.sevices.VoyageService;
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
    public List<Voyage> getAll() {
        return voyageRepo.findAll();
    }

    @Override
    public VoyageCreateDto create(VoyageCreateDto voyageCreateDto) {
        Voyage voyage = new Voyage();
        voyage.setSendDate(voyageCreateDto.sendDate());
        voyage.setSendTime(voyageCreateDto.sendTime());
        voyage.setDestinationLocality(localityService.findById(voyageCreateDto.destinationLocality()));
        voyage.setStartingLocality(localityService.findById(voyageCreateDto.startingLocality()));
        voyage.setArrivalTime(voyageCreateDto.arrivalTime());
        voyage.setTrain(trainService.findById(voyageCreateDto.trainId()));
        voyage.setDistance(voyageCreateDto.distance());
        voyage.setPrice(voyageCreateDto.price());

        voyage = voyageRepo.save(voyage);

        return voyageCreateDto;
    }

    @Override
    public Voyage findById(long id) {
        return voyageRepo.findById(id).orElseThrow();
    }

    @Override
    public Voyage deleteById(long id) {
        Voyage voyage = voyageRepo.findById(id).orElseThrow();
        voyageRepo.delete(voyage);
        return voyage;
    }
}
