package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Backend.Indus1.dao.CategoryDAO;
import com.project.Backend.Indus1.model.Category;

@Controller
public class CategoryController 
{

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Category")
	public String showCategoryPage()
	{
		System.out.println("---Category Page Displaying-----");
		return "Category";
	}
	
	@RequestMapping(value="/AddCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc)
	{
		System.out.println("---Add Category Starting-----");
		
		System.out.println(catname+":::"+catdesc);
		
		Category category=new Category();
		category.setCatname(catname);
		category.setCatdesc(catdesc);
		
		categoryDAO.insertUpdateCategory(category);
		System.out.println("---Category Added----");
		return "Category";
	}
	
}