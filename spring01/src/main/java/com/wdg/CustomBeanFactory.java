package com.wdg;

import com.wdg.annotation.CustomBean;
import org.springframework.util.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: wangdaogang
 * @create: 2020/01/28
 **/
public final class CustomBeanFactory {

    private static ConcurrentHashMap<String,Object> beanMap = new ConcurrentHashMap<String, Object>();

    public static Map<String,Object> parseConfiguration(Class<?>... configClass){
        Assert.notEmpty(configClass);
        for (Class temp : configClass){
            Annotation[] annotaions = temp.getDeclaredAnnotations();
        }
        return beanMap;
    }

    private static void parseAnnotation(Annotation annotation, Class currentClass, Method currentMethod) throws Exception {
        if(annotation instanceof CustomBean){
            CustomBean customBean = (CustomBean) annotation;
            currentMethod.invoke(currentClass.newInstance(),null);
        }
    }

}
