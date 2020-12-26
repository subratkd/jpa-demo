package com.example.databasedemo.jdbc;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.databasedemo.entity.Person;
import com.example.databasedemo.entity.Person2;

@Repository
@Transactional
public class PersonRepository  {
	
	@Autowired
	EntityManager entityManager;
	
	public Person2 findAll() {
		TypedQuery<Person2> namedQuery = entityManager.createNamedQuery("find-all-person",Person2.class);
		return namedQuery.getSingleResult();
	}
	public Person2 findById(int id) {
		
		return entityManager.find(Person2.class,id);
	}
	public Person2 insert(Person2 person) {
		
		return entityManager.merge(person);
	}
	public Person2 update(Person2 person) {
			
			return entityManager.merge(person);
		}
   
	
	

}
