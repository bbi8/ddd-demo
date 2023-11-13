package com.ddd.demo.support.api;

import java.io.Serializable;
import java.util.List;

public interface IApi<A> {

    //    @GetMapping("/queryAll")
    List<A> queryAll();

    //    @PostMapping(value = "/queryList")
    List<A> queryList(A entity);

    //    @PostMapping("/getOne")
    A getOne(A entity);

    //    @GetMapping("/getById")
    A getById(Serializable id);

    //    @PostMapping("/count")
    Integer count(A entity);

    //    @PostMapping("/save")
    Boolean save(A entity);

    //    @PostMapping("/saveAndReturn")
    A saveAndReturn(A entity);

    //    @PostMapping("/saveOrUpdate")
    Boolean saveOrUpdate(A entity);

    //    @PostMapping("/saveOrUpdateBatch")
    Boolean saveOrUpdateBatch(List<A> list);

    //    @PostMapping("/saveBatch")
    Boolean saveBatch(List<A> list);

    //    @PostMapping("/updateById")
    Boolean updateById(A entity);

    //    @PostMapping("/updateBatchById")
    Boolean updateBatchById(List<A> list);

    //    @PostMapping("/remove")
    Integer remove(A entity);

    //    @PostMapping("/removeById")
    Boolean removeById(Serializable id);

}
