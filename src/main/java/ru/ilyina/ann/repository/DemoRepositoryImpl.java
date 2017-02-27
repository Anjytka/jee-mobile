package ru.ilyina.ann.repository;

import ru.ilyina.ann.domain.MDemo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by anjytka on 27.02.17.
 */

@Stateless
public class DemoRepositoryImpl implements DemoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MDemo> getAll() {
        return entityManager.createNamedQuery(MDemo.Query.SELECT_ALL, MDemo.class).getResultList();
    }
}
