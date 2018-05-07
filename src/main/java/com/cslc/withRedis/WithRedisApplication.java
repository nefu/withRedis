package com.cslc.withRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
//启动定时任务配置
@EnableScheduling
@SpringBootApplication
public class WithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WithRedisApplication.class, args);
	}
}
