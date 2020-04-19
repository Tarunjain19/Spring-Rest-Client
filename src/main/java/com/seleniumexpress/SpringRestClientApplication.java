package com.seleniumexpress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestClientApplication {
	
	  private static final Logger LOGGER=LoggerFactory.getLogger(SpringRestClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRestClientApplication.class, args);

		System.out.println("In Timout example yes");
		
		LOGGER.info("Yes it is logger");
		
	}

}
