package com.cslc.withRedis;

import com.cslc.withRedis.domain.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

/**
 * Created by jay on 2018/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskTest {
    @Autowired
    private Task task;
    @Test
    public void test() throws Exception{
        Long start = System.currentTimeMillis();
        Future<String> task1 = task.taskOne();
        Future<String> task2 = task.taskTwo();
        Future<String> task3 = task.taskThree();
        while (true){
            if(task1.isDone()&&task2.isDone()&&task3.isDone()){
                Long end = System.currentTimeMillis();
                System.out.println("任务都已经完成 用时"+(end-start)+"毫秒");
                break;
            }
        }
    }


}
