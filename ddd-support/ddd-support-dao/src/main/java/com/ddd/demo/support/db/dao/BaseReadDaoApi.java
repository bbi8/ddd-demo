package com.ddd.demo.support.db.dao;

import com.ddd.demo.support.api.IApi;

import java.io.Serializable;
import java.util.List;


public abstract class BaseReadDaoApi<P, A> implements IApi<A> {

    @Override
    public List<A> queryAll() {
        return null;
    }

    @Override
    public List<A> queryList(A entity) {
        return null;
    }

    @Override
    public A getOne(A entity) {
        return null;
    }

    @Override
    public A getById(Serializable id) {
        return null;
    }

    @Override
    public Integer count(A entity) {
        return null;
    }

}
