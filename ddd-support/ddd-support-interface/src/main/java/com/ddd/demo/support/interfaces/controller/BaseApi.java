package com.ddd.demo.support.interfaces.controller;

import com.ddd.demo.support.api.IApi;
import com.ddd.demo.support.domain.repository.IRepository;

import java.io.Serializable;
import java.util.List;


public class BaseApi<R> extends BaseQueryApi<R> implements IApi<R> {

    private IRepository<R> repository;

    @Override
    public Boolean save(R entity) {
        return repository.save(entity);
    }

    @Override
    public R saveAndReturn(R entity) {
        return repository.saveAndReturn(entity);
    }

    @Override
    public Boolean saveOrUpdate(R entity) {
        return repository.saveOrUpdate(entity);
    }

    @Override
    public Boolean saveOrUpdateBatch(List<R> list) {
        return repository.saveOrUpdateBatch(list);
    }

    @Override
    public Boolean saveBatch(List<R> list) {
        return repository.saveBatch(list);
    }

    @Override
    public Boolean updateById(R entity) {
        return repository.updateById(entity);
    }

    @Override
    public Boolean updateBatchById(List<R> list) {
        return repository.updateBatchById(list);
    }

    @Override
    public Integer remove(R entity) {
        return repository.remove(entity);
    }

    @Override
    public Boolean removeById(Serializable id) {
        return repository.removeById(id);
    }

}
