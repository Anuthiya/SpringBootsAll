package com.example.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsingJunitApplication {
	static Logger log=Logger.getLogger(UsingJunitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UsingJunitApplication.class, args);
		BasicConfigurator.configure();
		log.info("Hello");
		log.debug("Welcome");
		log.error("Junit");
		log.warn("Logger");
	}

}
