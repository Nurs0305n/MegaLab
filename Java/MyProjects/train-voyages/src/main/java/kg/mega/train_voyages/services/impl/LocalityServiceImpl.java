package kg.mega.train_voyages.services.impl;

import kg.mega.train_voyages.models.Locality;
import kg.mega.train_voyages.repositories.LocalityRepo;
import kg.mega.train_voyages.services.LocalityService;
import org.springframework.stereotype.Service;

@Service
public class LocalityServiceImpl implements LocalityService {

    private final LocalityRepo localityRepo;

    public LocalityServiceImpl(LocalityRepo localityRepo) {
        this.localityRepo = localityRepo;
    }

    @Override
    public Locality findById(Long id) {
        return localityRepo.findById(id).orElseThrow();
    }
}
