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
	
	public Category getCategory(int catid)
	{
		Session session=sessionFactory.openSession();
		Category product=(Category)session.get(Product.class,catid);
		session.close();
		return product;
	}
	
	@Transactional
	public void deleteCategory(Category category)
	{
		sessionFactory.getCurrentSession().delete(category);
	}
	
	public List<Product> getCategoryDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from product");
		List<Product> list=query.list();
		session.close();
		return list;
	}
}