package com.academy.model.repository;

import java.util.List;

public interface DefaultRepository<T> {
    Class<T> getType();

    void save(T entity);

    List<T> findAll();

    void delete(T entity);

    T findById(Integer id);
}
