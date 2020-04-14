package com.wdg.entity;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: wangdaogang
 * @create: 2020/01/28
 **/

public class Person implements  BeanPostProcessor , InitializingBean, DisposableBean {
    private String name;
    private Integer age;

    public Person() {
    }

    public void init(){
        System.out.println("init");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "bean实例化前" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "bean实例化后" + bean);
        if(bean instanceof Person){
            Person person = (Person) bean;
            person.age = 100;
            person.name = "修改";
            return person;
        }
        return bean;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean销毁。。。。。。。。。。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化。。。。。。。。。。。。");
    }
}
