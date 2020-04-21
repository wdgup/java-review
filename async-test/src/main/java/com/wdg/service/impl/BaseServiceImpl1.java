package com.wdg.service.impl;

import com.wdg.component.EuecuteTask;
import com.wdg.service.BaseService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: wangdaogang
 * @create: 2020/03/24
 **/
@Service
public class BaseServiceImpl1 implements BaseService1 {

    @Autowired
    private EuecuteTask euecuteTask;
    @Override
    public String testAsync(String type) {
        System.out.println(type);
        Map<String, String> execute = euecuteTask.execute(type);
        System.out.println(execute);
        euecuteTask.remove();
        return "test";
    }


}
