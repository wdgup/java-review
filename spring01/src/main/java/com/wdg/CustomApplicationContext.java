package com.wdg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: wangdaogang
 * @create: 2020/01/28
 **/
public class CustomApplicationContext {

    private static Map map = new ConcurrentHashMap();


    public CustomApplicationContext(){

    }
    public CustomApplicationContext(Class<?>... configClass){
        this();
        map = CustomBeanFactory.parseConfiguration(configClass);
    }
}
