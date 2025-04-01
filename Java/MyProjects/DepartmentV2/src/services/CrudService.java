package services;

import java.util.List;

public interface CrudService<T, I> {
    void create(T t);
    void update(T t);
    List<T> getAll();
    T findByID(I id);
    void delete(I id);

}
