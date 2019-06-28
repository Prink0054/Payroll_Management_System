package com.java.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.model.User;



@Repository
public class MyDaoImpl implements MyDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	@Override
	public User checkLogin(String email, String password) {
		Session session=sessionFactory.openSession();
		List<User> getAll=session.createQuery("From User").list();
		for(User user:getAll)
		{
			if(email.equals(user.getEmail())&&password.equals(user.getPassword()))
			{
				System.out.println(user.getUser_type());
				return user;
			}
			
		}
		return null;
	}



	@Override
	public void logout() {
		sessionFactory.close();
		
	}



	@Override
	public List<User> getall() {
		Session session=sessionFactory.openSession();
		List<User> getAll=session.createQuery("From User").list();
		return getAll;
	}



	@Transactional
	@Override
	public void save(User user) {
		System.out.println(user.getContact_number());
		sessionFactory.getCurrentSession().save(user);
	
		

		
	}



	  
		
	



}
	

