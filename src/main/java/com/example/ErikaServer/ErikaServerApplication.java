package com.example.ErikaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class ErikaServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ErikaServerApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(ErikaServerApplication.class, args);
	}

}
