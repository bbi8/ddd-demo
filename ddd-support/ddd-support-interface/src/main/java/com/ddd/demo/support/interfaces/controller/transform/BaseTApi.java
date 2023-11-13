package com.ddd.demo.support.interfaces.controller.transform;

import com.ddd.demo.support.api.IApi;
import com.ddd.demo.support.domain.repository.IRepository;

import java.io.Serializable;
import java.util.List;


public abstract class BaseTApi<R, A> extends BaseTQueryApi<R, A> implements IApi<A> {

    private IRepository<R> repository;

    @Override
    public Boolean save(A entity) {
        return repository.save((R) entity);
    }

    @Override
    public A saveAndReturn(A entity) {
        return (A) repository.saveAndReturn((R) entity);
    }

    @Override
    public Boolean saveOrUpdate(A entity) {
        return repository.saveOrUpdate((R) entity);
    }

    @Override
    public Boolean saveOrUpdateBatch(List<A> list) {
        return repository.saveOrUpdateBatch((List<R>) list);
    }

    @Override
    public Boolean saveBatch(List<A> list) {
        return repository.saveBatch((List<R>) list);
    }

    @Override
    public Boolean updateById(A entity) {
        return repository.updateById((R) entity);
    }

    @Override
    public Boolean updateBatchById(List<A> list) {
        return repository.updateBatchById((List<R>) list);
    }

    @Override
    public Integer remove(A entity) {
        return repository.remove((R) entity);
    }

    @Override
    public Boolean removeById(Serializable id) {
        return repository.removeById(id);
    }

}
