package kg.mega.train_voyages.services;

import kg.mega.train_voyages.models.Train;

public interface TrainService {

    Train findById(Long id);
}
