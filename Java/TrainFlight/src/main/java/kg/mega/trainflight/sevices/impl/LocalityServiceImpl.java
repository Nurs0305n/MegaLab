package kg.mega.trainflight.sevices.impl;

import kg.mega.trainflight.models.Locality;
import kg.mega.trainflight.repositories.LocalityRepo;
import kg.mega.trainflight.sevices.LocalityService;
import org.springframework.stereotype.Service;

@Service
public class LocalityServiceImpl implements LocalityService {

    private final LocalityRepo localityRepo;

    public LocalityServiceImpl(LocalityRepo localityRepo) {
        this.localityRepo = localityRepo;
    }

    @Override
    public Locality findById(long id) {
        return localityRepo.findById(id).orElse(null);
    }
}
