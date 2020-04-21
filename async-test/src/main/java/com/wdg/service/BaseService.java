package com.wdg.service;

import java.util.List;

public interface BaseService<T> {

    List<T> select(T t);

    List<T> selectAll();

    List<T> selectByIds(String ids);

    int selectCount(T t);

    int insert(T record);

    int insertSelective(T record);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    int deleteByPrimaryKey(Object o);

    int delete(T t);

    boolean existsWithPrimaryKey(Object o);

    T selectByPrimaryKey(Object o);

    T selectOne(T t);

    int deleteByIds(String s);
}