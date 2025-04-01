package kg.mega.trainflight.sevices.impl;

import kg.mega.trainflight.models.Carriage;
import kg.mega.trainflight.repositories.CarriageRepo;
import kg.mega.trainflight.sevices.CarriageService;
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
