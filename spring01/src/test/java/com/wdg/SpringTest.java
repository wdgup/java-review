package com.wdg;

import com.wdg.config.BeanConfiguration;
import com.wdg.entity.Person;
import com.wdg.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: wangdaogang
 * @create: 2020/01/28
 **/

public class SpringTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        User bean = context.getBean(User.class);
        //System.out.println(bean);
        context.close();
        //Person bean = context.getBean(Person.class);
        //System.out.println(bean);
    }
}
