package com.project.Backend.Indus1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Backend.Indus1.model.*;

@Repository("supplierDAO")
public class SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public SupplierDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUpdateSupplier(Supplier supplier)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);
	}
	
	public Supplier getCategory(int catid)
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,catid);
		session.close();
		return supplier;
	}
	
	@Transactional
	public void deleteCategory(Category category)
	{
		sessionFactory.getCurrentSession().delete(category);
	}
	
	public List<Supplier> getCategoryDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from product");
		List<Supplier> list=query.list();
		session.close();
		return list;
	}
}