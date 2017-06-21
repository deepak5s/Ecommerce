package com.project.Backend.Indus1;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Backend.Indus1.dao.SupplierDAO;
import com.project.Backend.Indus1.model.Supplier;


public class SupplierTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.project.Backend.Indus1");
		
		context.refresh();
		
		// Inserting a Category Object.
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		//Insertion TestCase
		
		Supplier supplier=new Supplier();
		supplier.setAddress("BajrangNagar");
		supplier.setSuppid(108);
		supplier.setSuppname("Neeraj");
		

		supplierDAO.insertUpdateSupplier(supplier);		
		System.out.println("Supplier ceeated");
		
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

