package com.wdg.service.impl;

import com.wdg.entity.Person;
import com.wdg.mapper.BaseMapper;
import com.wdg.mapper.PersonMapper;
import com.wdg.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: wangdaogang
 * Date: 2020/4/15
 * Description: No Description
 */
@Service
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService {

    @Autowired
    private BaseMapper baseMapper;
    @Autowired
    private PersonMapper personMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void testPerson() {
        try {
            Person p = new Person();
            p.setName("test1");
            personMapper.insert(p);
            int i = 1/0;
        }catch (Exception e){
        }
        Person p = new Person();
        p.setName("test2");
        personMapper.insert(p);
        int i = 1/0;
    }

    @Override
    public BaseMapper<Person> getMapper() {
        return baseMapper;
    }
}
