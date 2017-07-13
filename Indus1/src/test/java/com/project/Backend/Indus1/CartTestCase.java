package com.project.Backend.Indus1;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Backend.Indus1.dao.CartDAO;
import com.project.Backend.Indus1.model.Cart;

public class CartTestCase 
{
public static void main(String[] args)
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.project.Backend.Indus1");
	context.refresh();
	CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
			Cart cart=new Cart();
	cart.setCartid(108);
	cart.setProdid(3);
	cart.setProdname("Leggin");
	cart.setPrice(12000);
	cart.setQuantity(6);
	cart.setStatus("N");
	cart.setUsername("Tyagi");
	cartDAO.addToCart(cart);
	System.out.println("Added To Cart");
	List<Cart> list=cartDAO.getCartItems("Tyagi");
	
	for(Cart cart2:list)
	{
		System.out.println(cart2.getCartid()+";;;");
		System.out.println(cart2.getProdid()+";;;");
		System.out.println(cart2.getProdname()+";;;");
		System.out.println(cart2.getPrice()+";;;");
		System.out.println(cart2.getQuantity()+";;;");
		
	}
			
	
}
}
