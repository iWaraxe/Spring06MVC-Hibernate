package com.coherentsolutions.spring.mvc.dao;

import com.coherentsolutions.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}