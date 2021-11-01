package com.abhi.springboot.basics.springboot.basics;

import com.abhi.springboot.basics.springboot.basics.entity.Person;
import com.abhi.springboot.basics.springboot.basics.jdbc.PersonJdbcDao;
import com.abhi.springboot.basics.springboot.basics.springdata.PersonSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonSpringDataRepository repository;

    @Autowired
    PersonJdbcDao dao;

    @GetMapping("/persons")
    public List<Person> getAllPerson(){
//        return Arrays.asList(new Person(1007, "Vishal", "Gaya", age));
        return dao.findAll();
    }
}
