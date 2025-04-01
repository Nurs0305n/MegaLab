package kg.mega.train_voyages.services.impl;

import kg.mega.train_voyages.models.Train;
import kg.mega.train_voyages.repositories.TrainRepo;
import kg.mega.train_voyages.services.TrainService;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl implements TrainService {

    private final TrainRepo trainRepo;

    public TrainServiceImpl(TrainRepo trainRepo) {
        this.trainRepo = trainRepo;
    }

    @Override
    public Train findById(Long id) {
        return trainRepo.findById(id).orElseThrow();
    }
}
