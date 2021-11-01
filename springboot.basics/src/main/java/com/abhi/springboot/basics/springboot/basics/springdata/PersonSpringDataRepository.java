package com.abhi.springboot.basics.springboot.basics.springdata;

import com.abhi.springboot.basics.springboot.basics.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
