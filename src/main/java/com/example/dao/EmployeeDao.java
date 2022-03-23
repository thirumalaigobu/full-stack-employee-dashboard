package com.example.dao;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees() {
        return jdbcTemplate.query("SELECT * FROM EMPLOYEES", new BeanPropertyRowMapper<>(Employee.class));
    }
}
