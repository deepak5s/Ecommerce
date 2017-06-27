package com.project.Frotend.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.Backend.Indus1.dao.CategoryDAO;
import com.project.Backend.Indus1.dao.ProductDAO;
import com.project.Backend.Indus1.model.Category;
import com.project.Backend.Indus1.model.Product;

@Controller
public class ProductController 
{
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/Product")
	public String showProduct(Model m)
	{
		
		
		Product product=new Product();
		
		m.addAttribute("catlist",this.getCatList());
		m.addAttribute("product",product);
		
		List<Product> prodlist=productDAO.getCategoryDetails();
		m.addAttribute("prodlist",prodlist);
		
		
		return "Product";
	}
	
	@RequestMapping(value="/InsertProduct",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Product product, Model m,@RequestParam("pimage") MultipartFile filedet,BindingResult result) 

	{
		System.out.println("---Product Inserted---");
		productDAO.insertUpdateCategory(product);
		System.out.println("---Image Storing Start---");
		String path="D:\\EZONE\\IndusFrontend\\src\\main\\webapp\\resources\\images";
		String fileinfo=path+product.getProdid()+".jpg";
        File file=new File(fileinfo);
        if(!filedet.isEmpty()){
        	
        try{
        	byte buff[]=filedet.getBytes();
        	FileOutputStream fos=new FileOutputStream(file);
        	BufferedOutputStream bs=new BufferedOutputStream(fos);
        	bs.write(buff);
        }	
        catch(Exception e){
        	System.out.println("---------Exception Aa Rahi he---------");
        	
        }
        	
        }
        else{
        	System.out.println("File not uploaded");
        }	
        	
        System.out.println("---Image Inserted---");
		List<Product> prodlist=productDAO.getCategoryDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "Product";
	}
	
	@RequestMapping(value="/updateProduct/{prodid}")
	public String updateProduct(@PathVariable("prodid")int prodid,Model m)
	{
		
		Product product=productDAO.getCategory(prodid);
		
		m.addAttribute("product",product);
		m.addAttribute("catlist",this.getCatList());
		List<Product> prodlist=productDAO.getCategoryDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "redirect:/Product";
	}
	
	@RequestMapping(value="/deleteProduct/{prodid}")
	public String deleteProduct(@PathVariable("prodid")int prodid,Model m)
	{
		
		Product product=productDAO.getCategory(prodid);
		productDAO.deleteCategory(product);
		
		Product product1=new Product();
		m.addAttribute("product",product1);
		m.addAttribute("catlist",this.getCatList());
		List<Product> prodlist=productDAO.getCategoryDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "Product";
	}
	
	public LinkedHashMap<Integer,String> getCatList()
	{
		List<Category> list=categoryDAO.getCategoryDetails();
		
		LinkedHashMap<Integer,String> catlist=new LinkedHashMap<Integer,String>();
		
		for(Category cat:list)
		{
			catlist.put(cat.getCatid(),cat.getCatname());
		}
		
		return catlist;
	}
	
	
	
	
}