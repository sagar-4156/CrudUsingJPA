package com.TrainingManagement.service;

import java.util.List;

import com.TrainingManagement.models.User;

public interface UserService {
	
	public List<User> getAllUser();
	public User getUserByUserName(String empName);

	public User validate(int empId,String password);

}
