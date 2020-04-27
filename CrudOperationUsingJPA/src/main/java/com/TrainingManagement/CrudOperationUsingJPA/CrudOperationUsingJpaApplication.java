package com.TrainingManagement.CrudOperationUsingJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.TrainingManagement.Repository.UserRepository;
import com.TrainingManagement.models.User;

@SpringBootApplication
@ComponentScan({ "com.TrainingManagement.controller"})
@Configuration
public class CrudOperationUsingJpaApplication {


	public static void main(String[] args) {

		SpringApplication.run(CrudOperationUsingJpaApplication.class, args);
	
		
				}

	

}
