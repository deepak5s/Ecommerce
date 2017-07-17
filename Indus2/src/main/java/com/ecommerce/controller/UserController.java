package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Backend.Indus1.dao.UserDAO;
import com.project.Backend.Indus1.model.User;

@Controller
public class UserController 
{

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/User")
	public String showCategoryPage()
	{
		System.out.println("---User Page Displaying-----");
		return "Category";
	}
	
	@RequestMapping(value="/AddUser",method=RequestMethod.POST)
	public String addUser(@RequestParam("CustFirstName") String custfirstName,@RequestParam("CustLastName") String custLastName)
	{
		System.out.println("---Add User Starting-----");
		
		System.out.println(custLastName+":::"+custfirstName);
		
		User user=new User();
		user.setCustFirstName(custfirstName);
		user.setCustLastName(custLastName);
		
		userDAO.insertUpdateUser(user);
		System.out.println("---Category Added----");
		return "User";
	}
	
}