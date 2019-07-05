package com.nag.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class SBootApplication {

	final static Logger logger = LogManager.getLogger(SBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SBootApplication.class, args);
	}

}
