package com.ddd.demo.support.interfaces.controller;

import com.ddd.demo.support.api.IQueryApi;
import com.ddd.demo.support.query.repository.IQueryRepository;

import java.io.Serializable;
import java.util.List;


public class BaseQueryApi<R> implements IQueryApi<R> {

    private IQueryRepository<R> repository;

    @Override
    public List<R> queryAll() {
        return repository.queryAll();
    }

    @Override
    public List<R> queryList(R entity) {
        return repository.queryList(entity);
    }

    @Override
    public R getOne(R entity) {
        return repository.getOne(entity);
    }

    @Override
    public R getById(Serializable id) {
        return repository.getById(id);
    }

    @Override
    public Integer count(R entity) {
        return repository.count((R) entity);
    }

}
