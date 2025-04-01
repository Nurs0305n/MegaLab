package nurs.trainvoyage.services;

import nurs.trainvoyage.models.Train;

public interface TrainService {
    Train findById(long id);
}
