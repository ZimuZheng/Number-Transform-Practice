package com.itlize.HelloWorld;

import com.itlize.service.NumberChangeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	NumberChangeService numberChangeService;

	@Test
	void contextLoads() {
		System.out.println(numberChangeService.change("0123456789"));
	}

}
