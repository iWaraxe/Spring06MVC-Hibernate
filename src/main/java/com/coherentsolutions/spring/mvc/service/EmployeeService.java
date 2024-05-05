package com.coherentsolutions.spring.mvc.service;

import com.coherentsolutions.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
 }
