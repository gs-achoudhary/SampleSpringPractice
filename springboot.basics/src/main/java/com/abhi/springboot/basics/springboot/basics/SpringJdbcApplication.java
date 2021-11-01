package com.abhi.springboot.basics.springboot.basics;

import com.abhi.springboot.basics.springboot.basics.entity.Person;
import com.abhi.springboot.basics.springboot.basics.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	JdbcTemplate jdbcTemplate;
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String sql = "insert into person\n" +
				"(id, name, location, age)\n" +
				"values(1002, 'Sai', 'Bangalore', 27);";


		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("A new row has been inserted.");
		}

//		logger.info("All users -> {}", dao.findAll());
//		logger.info("User Id 1001 -> {}", dao.findById(1001));
//		logger.info("Deleting 1002 -> {}", dao.deleteById(1002));
//		logger.info("Inserting 1005 -> {}", dao.insert(new Person(1005, "Ujjwal", "Patna", 28)));
//		logger.info("Updating 1003 -> {}", dao.update(new Person(1003, "Aditya Agrawal", "Lucknow", 26)));

	}
}

