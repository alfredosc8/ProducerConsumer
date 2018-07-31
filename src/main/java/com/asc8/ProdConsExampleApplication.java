package com.asc8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class ProdConsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdConsExampleApplication.class, args);
	}
}
