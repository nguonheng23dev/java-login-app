package com.dpt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class MyWebAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}

}
