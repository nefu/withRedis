package com.cslc.withRedis;

import com.cslc.withRedis.domain.Person;
import com.cslc.withRedis.domain.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jay on 2018/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonTest {
    @Autowired
    private PersonRepository personRepository;
    @Test
    public void test() throws Exception{
        personRepository.save(new Person("ximing","12"));

        System.out.println(personRepository.findByName("xiaoming").getName()+"这是第一次查询");
        System.out.println(personRepository.findByName("xiaoming").getName()+"这是第二次查询");
    }
}
