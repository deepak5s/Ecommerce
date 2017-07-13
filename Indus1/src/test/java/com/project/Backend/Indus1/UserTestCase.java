package com.project.Backend.Indus1;

import java.util.List;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Backend.Indus1.dao.UserDAO;
import com.project.Backend.Indus1.model.UserRegister;

public class UserTestCase {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.project.Backend.Indus1");
		context.refresh();

		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");

		UserRegister user = new UserRegister();

		user.setAddress("Faridabad");
		user.setPassword("123");
		user.setCustomername("Aakash");

		user.setEmail("a22@gmail.com");
		user.setRole("ROLE_USER");
		user.setMobile(123456);
        user.setUsername("tyagi123"); 
		userDAO.insertUpdateUser(user);
		System.out.println("User Inserted");

		// Retrieval TestCase

		/*
		 * UserRegister user1=userDAO.getUser("");
		 * System.out.println("User Name:"+user1.getUsername());
		 * System.out.println("User Description:"+user1.getRole());
		 * 
		 * //Deletion TestCase /*UserRegister user2=userDAO.getUser("");
		 * userDAO.deleteUser(user2); System.out.println("The User Deleted");
		 * 
		 * //Retrieving the Data
		 * 
		 * List<UserRegister> list=userDAO.getUserDetails();
		 * 
		 * for(UserRegister user3:list) {
		 * System.out.println(user3.getUsername()+":"+user3.getPassword()+":"+
		 * user3.getRole()); }
		 * 
		 * //Update the User UserRegister user4=userDAO.getUser("");
		 * user4.setRole(""); userDAO.insertUpdateUser(user4);
		 * System.out.println("The User Updated");
		 */

	}
}
