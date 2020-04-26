package com.TrainingManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.TrainingManagement.models.User;
import com.TrainingManagement.serviceImpl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String welcome() {

		return "Login";
	}
	
	@RequestMapping(value="/success",method= RequestMethod.POST)
	public String validateUser(@RequestParam int empId,@RequestParam String password)
	{
		User userObj=this.userServiceImpl.validate(empId, password);
		if(userObj==null)
		{
		 return null;
		}
		
		
			return "success";
		
		
	}

}
