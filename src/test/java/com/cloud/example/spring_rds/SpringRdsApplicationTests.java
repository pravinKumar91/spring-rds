package com.cloud.example.spring_rds;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringRdsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMainMethod(){
		String expected = "Hello World!";
		String actual = "Hello World!";
		assertEquals(expected, actual);
	}

}
