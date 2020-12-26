package com.example.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.databasedemo.entity.Person;
import com.example.databasedemo.jdbc.PersonRepository;
import com.example.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplicationJpa implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplicationJpa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//logger.info("All User ---->{}"+dao.updateById(10003,"Rama Ch Dash"));
	//logger.info("Add one  User ---->{}"+dao.insert(new Person(1004, "Alex", "Germany", new Date())));
	// logger.info("All Persons ---->{}"+repository.findById(10001));
	repository.deleteById(1001);

	// logger.info("All User ---->{}"+repository.findAll());
		
		
	}

}
