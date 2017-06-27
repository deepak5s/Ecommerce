package com.project.Backend.Indus1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Backend.Indus1.model.*;

@Repository("productDAO")
public class ProductDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUpdateCategory(Product product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
	}
	
	public Product getCategory(int prodid)
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,prodid);
		session.close();
		return product;
	}
	
	@Transactional
	public void deleteCategory(Product product)
	{
		sessionFactory.getCurrentSession().delete(product);
	}
	
	public List<Product> getCategoryDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		@SuppressWarnings("unchecked")
		List<Product> list=query.list();
		session.close();
		return list;
	}
}