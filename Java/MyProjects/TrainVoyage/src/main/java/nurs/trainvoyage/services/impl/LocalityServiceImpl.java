package nurs.trainvoyage.services.impl;

import nurs.trainvoyage.models.Locality;
import nurs.trainvoyage.repositories.LocalityRepo;
import nurs.trainvoyage.services.LocalityService;
import org.springframework.stereotype.Service;

@Service
public class LocalityServiceImpl implements LocalityService {

    private final LocalityRepo localityRepo;

    public LocalityServiceImpl(LocalityRepo localityRepo) {
        this.localityRepo = localityRepo;
    }

    public Locality findById(long id) {
        return localityRepo.findById(id).orElseThrow();
    }
}
