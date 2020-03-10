package com.wdg.config;

import com.wdg.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangdaogang
 * @create: 2020/01/28
 **/
@Configuration
public class BeanConfiguration {

    @Bean("person")
    public Person createPerson(){
        Person person = new Person();
        person.setAge(20);
        person.setName("zhangsan");
        return person;
    }
}
