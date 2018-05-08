package com.cslc.withRedis.domain;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by jay on 2018/5/7.
 *
 * @Async 用来定义方法的异步调用 但是函数不能是用static修饰的 异步会失败
 */
@Component
public class Task {
    private static Random random = new Random();

    @Async
    public Future<String> taskOne() throws Exception{
        System.out.println("开始执行任务一");
        Long startime = System.currentTimeMillis();
        Thread.sleep(6000);
        Long endtime = System.currentTimeMillis();
        System.out.println("任务一执行了"+(endtime-startime)+"秒");
        return new AsyncResult<>("任务一完成");
    }
    @Async
    public Future<String> taskTwo() throws Exception{
        System.out.println("开始执行任务二");
        Long startime = System.currentTimeMillis();
        Thread.sleep(7000);
        Long endtime = System.currentTimeMillis();
        System.out.println("任务二执行了"+(endtime-startime)+"秒");
        return new AsyncResult<>("任务二完成");
    }
    @Async
    public Future<String> taskThree() throws Exception{
        System.out.println("开始执行任务三");
        Long startime = System.currentTimeMillis();
        Thread.sleep(5000);
        Long endtime = System.currentTimeMillis();
        System.out.println("任务三执行了"+(endtime-startime)+"秒");
        return new AsyncResult<>("任务三完成");
    }
}
