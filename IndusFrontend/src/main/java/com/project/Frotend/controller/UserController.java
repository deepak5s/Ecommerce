package com.project.Frotend.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	
	public UserController() {
		System.out.println("User controller----");
	}

	@RequestMapping("/login_success")
	public String loginsuccess(HttpSession session) {
		System.out.println("loded successfully");
		String page = "null";
		boolean loggedIn = true;

		String username = SecurityContextHolder.getContext().getAuthentication().getName();

		session.setAttribute("username", username);
		session.setAttribute("loggedIn", loggedIn);

		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for (GrantedAuthority role : authorities) {
			System.out.println("Role:" + role.getAuthority() + "username" + username);

			if (role.getAuthority().equals("USER")) {

				return "AdminHome";
			} else {
				return "UserHome";
			}
		}
		return "page";
	}
}