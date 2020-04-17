package com.TrainingManagement.CrudOperationUsingJPA;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.TrainingManagement.models.Vendor;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan("com.TrainingManagement.models")
@ComponentScan({"com.TrainingManagement.service","com.TrainingManagement.serviceImpl","com.TrainingManagement.controller"})
@EnableJpaRepositories("com.TrainingManagement.Repository")
public class CrudOperationUsingJpaApplication {

	static
	Session session;
	public static void main(String[] args) {
		
		
		SpringApplication.run(CrudOperationUsingJpaApplication.class, args);
		Criteria criteria=session.createCriteria(Vendor.class);
		criteria.add(Restrictions.eq("vendorId", 1));
		List<Vendor> v=criteria.list();
		
		v.forEach(System.out::println);
 		
		
	}

}
