package services;

import db.PositionDB;
import models.Position;

import java.util.List;

public class PositionService implements CRUDService<Position, Integer> {
    private final PositionDB positionDB = new PositionDB();
    @Override
    public void create(Position position) {
        positionDB.insert(position);
    }

    @Override
    public void update(Position position) {
        positionDB.update(position);
    }

    @Override
    public List<Position> getList() {
        return positionDB.getList();
    }

    @Override
    public void delete(Integer id) {
        positionDB.delete(id);
    }

    @Override
    public Position getById(Integer id) {
        return positionDB.getById(id);
    }
}
