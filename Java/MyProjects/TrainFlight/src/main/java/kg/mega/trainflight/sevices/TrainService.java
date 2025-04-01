package kg.mega.trainflight.sevices;

import kg.mega.trainflight.models.Train;

public interface TrainService {
    Train findById(long id);
}
