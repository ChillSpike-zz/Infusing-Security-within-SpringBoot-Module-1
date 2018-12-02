package com.test.springboot.app.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Module1Application {

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}
}
