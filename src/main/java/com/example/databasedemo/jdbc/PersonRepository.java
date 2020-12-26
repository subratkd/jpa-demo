package com.example.databasedemo.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.databasedemo.entity.Persons;

@Repository
@Transactional
public class PersonRepository  {
	
	@Autowired
	EntityManager entityManager;
	
	public Persons findAll() {
		TypedQuery<Persons> namedQuery = entityManager.createNamedQuery("find-all-person",Persons.class);
		return namedQuery.getSingleResult();
	}
	public Persons findById(int id) {
		
		return entityManager.find(Persons.class,id);
	}
	public Persons insert(Persons person) {
		
		return entityManager.merge(person);
	}
	public Persons update(Persons person) {
			
		return entityManager.merge(person);
	}
	public void deleteById(int id) {
		Persons person = findById(id);
		entityManager.remove(person);
	}

}
