package com.test.springboot.dao;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 *dao层对数据库进行操作
 */
public interface BaseDAO<T> {

    void save(T t);

    void update(T t);

    void delete(String id);

    T findByid(String id);

    List<T> findAll();

    Long findTotalCounts();

    //参数1：起始条数  参数2：每页显示记录数
    List<T> findByPage(Integer start,Integer size);
}
