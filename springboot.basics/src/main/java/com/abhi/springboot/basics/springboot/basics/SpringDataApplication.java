package com.abhi.springboot.basics.springboot.basics;

import com.abhi.springboot.basics.springboot.basics.entity.Person;
import com.abhi.springboot.basics.springboot.basics.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User Id 1001 -> "+ repository.findById(1001));
		logger.info("All users -> {}", repository.findAll());
//		repository.deleteById(3);

//		logger.info("Inserting 1005 -> {}", repository.save(new Person(1005, "Ujjwal", "Patna", 24)));
//		logger.info("Updating 1003 -> {}", repository.save(new Person(1003, "Aditya Agrawal", "Lucknow", 25)));

	}
}
