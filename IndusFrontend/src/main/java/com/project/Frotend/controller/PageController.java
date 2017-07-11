package com.project.Frotend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/Aboutus")
	public String showAboutUs()
	{
		return "Aboutus";
		}

	@RequestMapping("/login")
	public String showLoginpage()
	{
		return "Login";
		}

}
