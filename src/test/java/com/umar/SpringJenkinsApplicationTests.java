package com.umar;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class SpringJenkinsApplicationTests {

	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
	 
		log.info("test case excecutiing...");
		assertEquals(true, true);
	}

}
