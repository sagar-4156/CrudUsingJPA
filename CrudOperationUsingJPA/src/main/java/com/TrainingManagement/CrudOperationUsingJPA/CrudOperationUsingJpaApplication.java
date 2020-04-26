package com.TrainingManagement.CrudOperationUsingJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan("com.TrainingManagement.models")
@ComponentScan({ "com.TrainingManagement.service", "com.TrainingManagement.serviceImpl",
		"com.TrainingManagement.controller" })
@EnableJpaRepositories("com.TrainingManagement.Repository")
public class CrudOperationUsingJpaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrudOperationUsingJpaApplication.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(CrudOperationUsingJpaApplication.class, args);

	}

}
