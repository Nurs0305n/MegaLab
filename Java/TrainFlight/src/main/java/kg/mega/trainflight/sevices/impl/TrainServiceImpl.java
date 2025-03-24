package kg.mega.trainflight.sevices.impl;

import kg.mega.trainflight.models.Train;
import kg.mega.trainflight.repositories.TrainRepo;
import kg.mega.trainflight.sevices.TrainService;
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
