package com.ddd.demo.support.interfaces.controller.transform;

import com.ddd.demo.support.api.IApi;
import com.ddd.demo.support.query.repository.IQueryRepository;

import java.io.Serializable;
import java.util.List;


public abstract class BaseTQueryApi<R, A> implements IApi<A> {

    private IQueryRepository<R> repository;

    @Override
    public List<A> queryAll() {
        return (List<A>) repository.queryAll();
    }

    @Override
    public List<A> queryList(A entity) {
        return (List<A>) repository.queryList((R) entity);
    }

    @Override
    public A getOne(A entity) {
        return (A) repository.getOne((R) entity);
    }

    @Override
    public A getById(Serializable id) {
        return (A) repository.getById(id);
    }

    @Override
    public Integer count(A entity) {
        return repository.count((R) entity);
    }

}
