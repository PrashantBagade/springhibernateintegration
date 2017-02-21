package com.springhib.dao;



import java.util.List;

import com.springhib.model.Person;

public interface PersonDao 
{

	public void save(Person p);
	
	public List<Person> list();
}
