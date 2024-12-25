package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.example.entities.*;
import org.example.repositories.*;
import org.example.services.*;
import org.example.controllers.*;


@SpringBootApplication
@Slf4j
@EntityScan
@EnableJpaRepositories
@ComponentScan
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}
