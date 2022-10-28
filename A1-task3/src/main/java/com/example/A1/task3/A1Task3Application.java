package com.example.A1.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.A1.task3.*"})
public class A1Task3Application {

	public static void main(String[] args) {
		SpringApplication.run(A1Task3Application.class, args);
	}

}
