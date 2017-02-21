package com.springhib.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.springhib.model.Person;

public class PersonDaoImpl implements PersonDao{

	private SessionFactory sessionFactory;
	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public PersonDaoImpl() {
		super();
	}

	public void save(Person p) {
		Session session=this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		session.flush();
		tx.commit();
		session.close();
	}

	public List<Person> list() {

		Session session=this.sessionFactory.openSession();
		List<Person> personList=session.createQuery("from Person").list();
		session.flush();
		session.close();
		
		return personList;
	}

	
}
