package services;

import java.util.List;

public interface CrudService <T ,S>{
    void create(T t);
    void update(T t);
    void delete(S s);
    List<T> getAll();
}
