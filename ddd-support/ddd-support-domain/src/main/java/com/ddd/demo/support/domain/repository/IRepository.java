package com.ddd.demo.support.domain.repository;

import com.ddd.demo.support.query.repository.IQueryRepository;

import java.io.Serializable;
import java.util.List;

public interface IRepository<R> extends IQueryRepository<R> {

    boolean save(R entity);

    R saveAndReturn(R entity);

    boolean saveOrUpdate(R entity);

    boolean saveBatch(List<R> entities);

    boolean saveOrUpdateBatch(List<R> entities);

    boolean updateById(R entity);

    boolean updateBatchById(List<R> entities);

    int remove(R entity);

    boolean removeById(Serializable id);

}
