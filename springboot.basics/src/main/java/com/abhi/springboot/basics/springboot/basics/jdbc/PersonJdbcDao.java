package com.abhi.springboot.basics.springboot.basics.jdbc;

import com.abhi.springboot.basics.springboot.basics.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setAge(rs.getInt("age"));
            return person;
        }
    }

    public List<Person> findAll(){
        return jdbcTemplate.query("SELECT * FROM PERSON;", new PersonRowMapper());
    }

    public Person findById(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM PERSON WHERE ID=?;",new Object[]{id}, new PersonRowMapper());
    }

    public int deleteById(int id){
        return jdbcTemplate.update("Delete FROM PERSON WHERE ID=?",new Object[]{id});
    }

    public int insert(Person person){
        return jdbcTemplate.update("insert into person\n" +
                "(id, name, location, birth_date)\n" +
                "values(?, ?, ?, ?);",new Object[]{person.getId(), person.getName(), person.getLocation(), person.getAge()});
    }

    public int update(Person person){
        return jdbcTemplate.update("update person\n" +
                "set name = ?, location = ?, birth_date = ?\n" +
                "where id = ?",new Object[]{person.getName(), person.getLocation(), person.getAge()});
    }
}
