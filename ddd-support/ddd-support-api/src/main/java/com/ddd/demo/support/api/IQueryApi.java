package com.ddd.demo.support.api;

import java.io.Serializable;
import java.util.List;

public interface IQueryApi<T> {

//    @GetMapping("/queryAll")
    List<T> queryAll();

//    @PostMapping(value = "/queryList")
    List<T> queryList(T dto);

//    @PostMapping("/getOne")
    T getOne(T dto);

//    @GetMapping("/getById")
    T getById(Serializable id);

//    @PostMapping("/count")
    Integer count(T dto);
}
