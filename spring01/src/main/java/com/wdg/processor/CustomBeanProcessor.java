package com.wdg.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * User: wangdaogang
 * Date: 2020/4/7
 * Description: No Description
 */
public class CustomBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("user ------postProcessBeforeInitialization()");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
         System.out.println("user ------postProcessAfterInitialization()");
        return bean;
    }
}
