package com.service.three;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ThreeApplicationTests {

	@Test
	void contextLoads() {

		String a= "a";
		String b = "a";
		Assert.isTrue(a.equals(b),"a");
	}

}
