package db;

import models.Resident;

import java.util.List;

public class ResidentDB implements DbHelper<Resident, Integer>{
    @Override
    public Resident findById(Integer id) {
        return null;
    }

    @Override
    public void insert(Resident resident) {

    }

    @Override
    public void update(Resident resident) {

    }

    @Override
    public List<Resident> getAll() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }
}
