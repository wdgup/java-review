package com.wdg.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

/**
 * User: wangdaogang
 * Date: 2020/4/7
 * Description: No Description
 */
public class User implements BeanFactoryPostProcessor , BeanPostProcessor , InstantiationAwareBeanPostProcessor ,
        BeanNameAware , BeanFactoryAware , InitializingBean , DisposableBean {
    private String name;
    private Integer age;

    public User() {
        System.out.println("执行user 构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("执行 [name] setter方法");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("执行 [age] setter方法");
        this.age = age;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("--------------postProcessBeanFactory()--------------");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------postProcessBeforeInitialization()--------------");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------postProcessAfterInitialization()--------------");
        return bean;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("--------------postProcessBeforeInstantiation()--------------");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("--------------postProcessAfterInstantiation()--------------");
        return false;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("--------------postProcessProperties()--------------");
        return null;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("--------------postProcessPropertyValues()--------------");
        return null;
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("--------------setBeanName()--------------");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("--------------setBeanFactory()--------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--------------afterPropertiesSet()--------------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--------------destroy()--------------");
    }
}
