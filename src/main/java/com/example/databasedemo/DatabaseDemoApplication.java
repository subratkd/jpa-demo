package com.example.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.databasedemo.jdbc.PersonRepository;
import com.example.databasedemo.entity.Persons;
import com.example.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao dao;
	@Autowired
	PersonRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	logger.info("JPA DEMO FIND ---->{}"+repository.findById(10001));
	logger.info("JPA DEMO INSERT ---->{}"+repository.insert(new Persons(10004,"Lizz","NY",new Date())));
	logger.info("JPA DEMO UPDATE ---->{}"+repository.update(new Persons(10003,"Ayushman Dash","NY",new Date())));
		
	}

}
