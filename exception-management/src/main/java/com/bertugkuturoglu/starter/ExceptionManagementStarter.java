package com.bertugkuturoglu.starter;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.bertugkuturoglu"})
@EnableJpaRepositories(basePackages = {"com.bertugkuturoglu"})
@ComponentScan(basePackages = {"com.bertugkuturoglu"})
@SpringBootApplication
public class ExceptionManagementStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementStarter.class, args);
	}

}
