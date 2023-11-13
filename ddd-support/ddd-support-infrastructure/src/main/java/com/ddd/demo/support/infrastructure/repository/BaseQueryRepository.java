package com.ddd.demo.support.infrastructure.repository;

import com.ddd.demo.support.query.repository.IQueryRepository;

import java.io.Serializable;
import java.util.List;


public class BaseQueryRepository<P, E> implements IQueryRepository<E> {

    @Override
    public List<E> queryAll() {
        return null;
    }

    @Override
    public List<E> queryList(E entity) {
        return null;
    }

    @Override
    public E getOne(E entity) {
        return null;
    }

    @Override
    public E getById(Serializable id) {
        return null;
    }

    @Override
    public Integer count(E entity) {
        return null;
    }

}
