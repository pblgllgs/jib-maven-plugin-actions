package com.pblgllgs.demotestjib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoTestJibApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoTestJibApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoTestJibApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			LOGGER.info("UP");
		};
	}

}
