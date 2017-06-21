package com.project.Backend.Indus1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Backend.Indus1.model.*;

@Repository("userDAO")
public class UserDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUpdateUser(User user)
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
	}
	
	public int getUser(int userid)
	{
		Session session=sessionFactory.openSession();
		User user=(User)session.get(User.class,userid);
		session.close();
		return userid;
	}
	
	@Transactional
	public void deleteUser(User user)
	{
		sessionFactory.getCurrentSession().delete(user);
	}
	
	public List<User> getCategoryDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User");
		List<User> list=query.list();
		session.close();
		return list;
	}
}