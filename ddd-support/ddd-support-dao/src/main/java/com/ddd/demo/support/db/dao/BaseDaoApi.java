package com.ddd.demo.support.db.dao;

import com.ddd.demo.support.api.IApi;

import java.io.Serializable;
import java.util.List;


public abstract class BaseDaoApi<P, A> extends BaseReadDaoApi<P, A> implements IApi<A> {

    @Override
    public Boolean save(A entity) {
        return null;
    }

    @Override
    public A saveAndReturn(A entity) {
        return null;
    }

    @Override
    public Boolean saveOrUpdate(A entity) {
        return null;
    }

    @Override
    public Boolean saveOrUpdateBatch(List<A> list) {
        return null;
    }

    @Override
    public Boolean saveBatch(List<A> list) {
        return null;
    }

    @Override
    public Boolean updateById(A entity) {
        return null;
    }

    @Override
    public Boolean updateBatchById(List<A> list) {
        return null;
    }

    @Override
    public Integer remove(A entity) {
        return null;
    }

    @Override
    public Boolean removeById(Serializable id) {
        return null;
    }

}
