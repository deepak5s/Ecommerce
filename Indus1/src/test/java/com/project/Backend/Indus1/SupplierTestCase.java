package com.project.Backend.Indus1;

import java.util.List;


import javax.naming.Context;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Backend.Indus1.dao.SupplierDAO;

import com.project.Backend.Indus1.model.Supplier;

public class SupplierTestCase 
{
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.project.Backend.Indus1");
	context.refresh();

SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");

	
Supplier supplier=new Supplier();

supplier.setSuppname("Amit");
supplier.setSuppaddress("Noida");

supplierDAO.insertUpdateSupplier(supplier);		
System.out.println("Supplier Inserted");


//Retrieval TestCase

		/*Supplier supplier=supplierDAO.getSupplier(2);
		System.out.println("Supplier Name:"+supplier.getSuppname());
		System.out.println("Supplier Description:"+supplier.getSuppaddress());
		
		//Deletion TestCase
		Supplier supplier=supplierDAO.getSupplier(2);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");
		
		//Retrieving the Data
		
		List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier1:list)
		{
			System.out.println(supplier1.getSuppid()+":"+supplier1.getSuppname()+":"+supplier1.getSuppaddress());
		}
		
		Update the Supplier
		Supplier supplier=supplierDAO.getSupplier(1);
		supplier.setSuppname("X");
		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("The Supplier Updated");
		
	
}

*/
}
}
