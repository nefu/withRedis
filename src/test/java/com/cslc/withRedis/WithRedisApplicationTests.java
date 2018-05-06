package com.cslc.withRedis;

import com.cslc.withRedis.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WithRedisApplicationTests {
	@Autowired
	private RedisTemplate<String,User> redisTemplate;

	@Test
	public void test() throws Exception {

		// 保存对象
		User user = new User("xiaoming", 20);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		user = new User("xiaoqiang", 30);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		user = new User("tuoni", 40);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		Assert.assertEquals(20, redisTemplate.opsForValue().get("xiaoming").getAge().longValue());
		Assert.assertEquals(30, redisTemplate.opsForValue().get("xiaoqiang").getAge().longValue());
		Assert.assertEquals(40, redisTemplate.opsForValue().get("tuoni").getAge().longValue());

	}

}
