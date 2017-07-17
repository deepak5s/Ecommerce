package com.project.Frotend.controller;

import org.springframework.stereotype.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("unused")
@Controller
public class PageController 
{
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "Login";
	}

	@RequestMapping("/logout")
	public String showLogout()
	{
		return "Main";
	}
	
	@RequestMapping("/Register")
	public String showSignup()
	{
		return "Register";
	}
	
	
	
	@RequestMapping("/ContactUs")
	public String showContact()
	{
		return "ContactUs";
	}
	
	@RequestMapping("/Main")
	public String showindex()
	{
		return "Main";
	}
	@RequestMapping("/p")
	public String showhead()
	{
		return "Header";
	}
	
	

}
