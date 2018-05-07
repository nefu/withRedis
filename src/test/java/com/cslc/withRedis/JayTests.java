package com.cslc.withRedis;

import com.cslc.withRedis.domain.JayInfo;
import org.junit.Assert;
import org.junit.Before;
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
public class JayTests {
    @Autowired
    private JayInfo jayInfo;
    @Before
    public void setup(){

    }
    @Test
    public void test(){
        Assert.assertEquals("chenjay",jayInfo.getName());
    }

}
