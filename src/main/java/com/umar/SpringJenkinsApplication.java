package com.umar;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
@RestController
@SpringBootApplication
public class SpringJenkinsApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@GetMapping("/leoleo")
	public String str()
	{
		return "successfull";
	}
	
	@PostConstruct
	public void init()
	{
		log.info("Application started....");
	}
	
	
	public static void main(String[] args) {
		log.info("Application executed....");
		log.info("bfej");
		
		SpringApplication.run(SpringJenkinsApplication.class, args);
	
	}

}
