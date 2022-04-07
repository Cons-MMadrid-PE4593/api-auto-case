package com.santander.connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Service API executor.
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.santander.connector","com.santander.connector.service","com.santander.connector.config"})
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Bean
	public void logEnvironmentVariables() {
//		LoggingUtils.logEnvironmentVariables(log);
	}
	
}