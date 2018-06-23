package com.example.sangameswaran.personalWebServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@SpringBootApplication
@EnableCaching
@ComponentScan
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class PersonalWebServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalWebServerApplication.class, args);
		System.out.println("--------------------SERVER STARTED-----------------");
	}
}
