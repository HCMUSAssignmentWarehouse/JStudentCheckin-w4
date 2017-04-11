package main.java.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Genius Doan on 4/11/2017.
 */

public interface IBaseService<T, ID extends Serializable> {
    T findOne(ID id);
    List<T> findAll();
    List<T> findAll(List<ID> listId);
    long count();
    boolean exists(ID id);
    T save(T entity);
    List<T> save(List<T> listEntity);
    void delete(ID id);
    void delete(T entity);
    void delete(List<T> listEntity);
    void deleteAll();
}