package com.project.Backend.Indus1;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Backend.Indus1.dao.UserDAO;
import com.project.Backend.Indus1.model.User;


public class UserTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.project.Backend.Indus1");
		
		context.refresh();
		
		// Inserting a Category Object.
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		//Insertion TestCase
		
		User user=new User();
		user.setUsername("tyagi123");
		user.setCustFirstName("Aaakash");
		user.setCustLastName("tyagi");
		user.setAddress("Hapur");
		user.setEnabled(true);
		user.setRole("USER_ROLE");
		user.setPassword("1234");
		

		userDAO.insertUpdateUser(user);		
		System.out.println("User ceeated");
		
		//Retrieval TestCase
		
		/*Category category=categoryDAO.getCategory(2);
		System.out.println("Category Name:"+category.getCatname());
		System.out.println("Category Description:"+category.getCatdesc());*/
		
		//Deletion TestCase
		/*Category category=categoryDAO.getCategory(2);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");*/
		
		//Retrieving the Data
		
		/*List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category:list)
		{
			System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
		}*/
		
		//Update the Category
	/*	Category category=categoryDAO.getCategory(3);
		category.setCatname("WifiEnMobile");
		categoryDAO.insertUpdateCategory(category);
		System.out.println("The Category Updated");*/
		
	}
}














