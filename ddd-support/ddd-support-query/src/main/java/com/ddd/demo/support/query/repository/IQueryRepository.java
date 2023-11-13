package com.ddd.demo.support.query.repository;

import java.io.Serializable;
import java.util.List;

public interface IQueryRepository<R> {

    List<R> queryAll();

    List<R> queryList(R entity);

    R getOne(R entity);

    R getById(Serializable id);

    Integer count(R entity);
}
