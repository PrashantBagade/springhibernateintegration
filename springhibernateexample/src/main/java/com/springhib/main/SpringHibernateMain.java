package com.springhib.main;



import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhib.dao.PersonDao;
import com.springhib.model.Person;

public class SpringHibernateMain {

	
	public static void main(String[] args) {
       ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
       PersonDao perdao= ctx.getBean(PersonDao.class);
       
       Person p1= new Person();
       p1.setName("prashant bagade");
       p1.setCountry("India");
       
       Person p2= new Person();
       p2.setName("prashant chitte");
       p2.setCountry("India");
       
       Person p3= new Person();
       p3.setName("Jaydeep Mohite");
       p3.setCountry("India");
       
       perdao.save(p1);
       perdao.save(p2);
       perdao.save(p3);
       
       List<Person> list=(List<Person>) perdao.list();
       for (Person person : list) {
		System.out.println("List of Person : "+person);
	}
	}
}
