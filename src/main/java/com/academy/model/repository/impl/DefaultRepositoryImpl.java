package com.academy.model.repository.impl;

import com.academy.model.DataSource;
import com.academy.model.repository.DefaultRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class DefaultRepositoryImpl<T> implements DefaultRepository<T> {
    private final Class<T> type;

    public DefaultRepositoryImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public Class<T> getType() {
        return type;
    }

    @Override
    public void save(T entity) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }


    @Override
    public T findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(type, id);
    }


    @Override
    public List<T> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from " + type.getSimpleName());
        return query.getResultList();
    }


    @Override
    public void delete(T entity) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }


}
