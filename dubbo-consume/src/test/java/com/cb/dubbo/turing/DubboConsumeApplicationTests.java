package com.cb.dubbo.turing;

import com.cb.clouds.dubboapi.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumeApplicationTests {
	@Autowired
	private DemoService demoService;
	@Test
	public void testDemoService(){
		String result = demoService.sayHello("hello");
		System.out.println(result);
	}
}
