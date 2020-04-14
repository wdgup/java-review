package com.wdg.config;

import com.wdg.entity.User;
import com.wdg.processor.CustomBeanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangdaogang
 * @create: 2020/01/28
 **/
@Configuration
public class BeanConfiguration {


//    @Bean(name = "person")
//    public Person createPerson(){
//        Person person = new Person();
//        person.setAge(20);
//        person.setName("zhangsan");
//        return person;
//    }

    @Bean
    public User createUser(){
        User user = new User();
        user.setAge(20);
        user.setName("张三");
        return user;
    }
    @Bean
    public CustomBeanProcessor customBeanProcessor(){
        return new CustomBeanProcessor();
    }
}
