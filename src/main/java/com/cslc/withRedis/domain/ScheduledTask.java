package com.cslc.withRedis.domain;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jay on 2018/5/7.
 * 对于定时任务的策略还有很多
 * fixedRate 上一次开始时间点 XXXX后开始任务
 * fixedDelay 上一次执行完毕时间点XXXX后开始执行
 * 也有一些组合搭配
 */
@Component
public class ScheduledTask {
    private static final SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void scheduled(){
        System.out.println("当前时间"+dateformat.format(new Date()));
    }

}
