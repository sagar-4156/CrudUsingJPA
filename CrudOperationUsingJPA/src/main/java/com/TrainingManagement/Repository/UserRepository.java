package com.TrainingManagement.Repository;

import org.springframework.data.repository.CrudRepository;

import com.TrainingManagement.models.User;

public interface UserRepository extends CrudRepository<User,String> {

	User findByEmpName(String empName);

	

}