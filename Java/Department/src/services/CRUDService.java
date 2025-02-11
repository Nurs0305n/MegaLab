package services;

import java.util.List;

public interface CRUDService<T, I> {

    void create(T t);
    void update(T t);
    List<T> getList();
    void delete(I id);
    T getById(I id);

}
