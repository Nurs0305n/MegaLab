package kg.mega.train_voyages.services.impl;

import kg.mega.train_voyages.models.Carriage;
import kg.mega.train_voyages.repositories.CarriageRepo;
import kg.mega.train_voyages.services.CarriageService;
import org.springframework.stereotype.Service;

@Service
public class CarriageServiceImpl implements CarriageService {
    private final CarriageRepo carriageRepo;

    public CarriageServiceImpl(CarriageRepo carriageRepo) {
        this.carriageRepo = carriageRepo;
    }

    @Override
    public Carriage findById(Long id) {
        return carriageRepo.findById(id).orElseThrow();
    }
}
