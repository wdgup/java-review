package com.wdg.service.impl;

import com.wdg.mapper.BaseMapper;
import com.wdg.service.BaseService;

import java.util.List;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-11 13:58
 **/
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    /**
     * 获取mapper
     * @return
     */
    public abstract BaseMapper<T> getMapper();

    @Override
    public List<T> select(T t) {
        return getMapper().select(t);
    }

    @Override
    public List<T> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public List<T> selectByIds(String ids) {
        return getMapper().selectByIds(ids);
    }

    @Override
    public int selectCount(T t) {
        return getMapper().selectCount(t);
    }

    @Override
    public int insert(T record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Object o) {
        return getMapper().deleteByPrimaryKey(o);
    }

    @Override
    public int delete(T t) {
        return getMapper().delete(t);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return getMapper().existsWithPrimaryKey(o);
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return getMapper().selectByPrimaryKey(o);
    }

    @Override
    public T selectOne(T t) {
        return getMapper().selectOne(t);
    }

    @Override
    public int deleteByIds(String s) {
        return getMapper().deleteByIds(s);
    }
}
