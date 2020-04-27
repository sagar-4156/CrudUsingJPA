package com.TrainingManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	
@RequestMapping("/")
public String home()
{
	return "welcome1";
}

@RequestMapping(value="/login")
public String loginPage()
{
	return "login1";
}
	
@RequestMapping("/logout-success")
public String logoutPage()
{
	return "logout";
}
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public String
	 * welcome() {
	 * 
	 * return "Login"; }
	 * 
	 * @RequestMapping(value="/success",method= RequestMethod.POST) public String
	 * validateUser(@RequestParam int empId,@RequestParam String password) { User
	 * userObj=this.userServiceImpl.validate(empId, password); if(userObj==null) {
	 * return null; }
	 * 
	 * 
	 * return "success";
	 * 
	 * 
	 * }
	 */

	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");

		return "login1";
	}

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcome(Model model) {
		return "welcome1";
	}*/
}
