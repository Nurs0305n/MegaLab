package nurs.trainvoyage.services.impl;

import nurs.trainvoyage.models.Train;
import nurs.trainvoyage.repositories.TrainRepo;
import nurs.trainvoyage.services.TrainService;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl implements TrainService {

    private final TrainRepo trainRepo;

    public TrainServiceImpl(TrainRepo trainRepo) {
        this.trainRepo = trainRepo;
    }

    @Override
    public Train findById(long id) {
        return trainRepo.findById(id).orElseThrow();
    }
}
