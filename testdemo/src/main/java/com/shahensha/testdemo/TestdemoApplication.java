package com.shahensha.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestdemoApplication.class, args);
	}

}
