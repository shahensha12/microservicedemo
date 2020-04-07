package com.shahensha.cloudconfigclientapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication

public class CloudconfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigclientApplication.class, args);
	}

}
