package com.wdg.component;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangdaogang
 * @create: 2020/03/24
 **/
@Component
public class EuecuteTask {

    private static final ThreadLocal<Map<String,String>> THREAD_MAP = new ThreadLocal<>();
    @Async
    public Map<String,String> execute(String type){
        System.out.println("当前线程："+Thread.currentThread().getName());
        if(THREAD_MAP.get() != null)
            return THREAD_MAP.get();
        Map<String,String> temp = new HashMap<>();

        if("1".equals(type)){
            temp.put("test1","test1");
            temp.put("a1","a1");
        }else{
            temp.put("bbbbb","ccccc");
            temp.put("ddddd","eeeee");
        }
        THREAD_MAP.set(temp);
        return temp;
    }

    public void remove(){
        THREAD_MAP.remove();
    }


}
