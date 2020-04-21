package com;

import com.wdg.RunApplication;
import com.wdg.entity.Person;
import com.wdg.mapper.PersonMapper;
import com.wdg.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * User: wangdaogang
 * Date: 2020/4/15
 * Description: No Description
 */
@SpringBootTest(classes = RunApplication.class)
@RunWith(SpringRunner.class)
public class TransactionTest {

    @Autowired
    private PersonService personService;

    @Test
    public void test1(){
        //List<Person> people = personService.selectAll();

        personService.testPerson();
    }

}
