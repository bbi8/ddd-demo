package com.ddd.demo.support.infrastructure.repository;

import com.ddd.demo.support.domain.repository.IRepository;

import java.io.Serializable;
import java.util.List;

public class BaseRepository<P, E> extends BaseQueryRepository<P, E> implements IRepository<E> {

    @Override
    public boolean save(E entity) {
        return false;
    }

    @Override
    public E saveAndReturn(E entity) {
        return null;
    }

    @Override
    public boolean saveOrUpdate(E entity) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(List<E> entities) {
        return false;
    }

    @Override
    public boolean saveBatch(List<E> entities) {
        return false;
    }

    @Override
    public boolean updateById(E entity) {
        return false;
    }

    @Override
    public boolean updateBatchById(List<E> entities) {
        return false;
    }

    @Override
    public int remove(E entity) {
        return 0;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

}
