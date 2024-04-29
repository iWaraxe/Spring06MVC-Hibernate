package com.coherentsolutions.spring.mvc.dao;

import com.coherentsolutions.spring.mvc.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Query<Employee> query = sessionFactory
                .getCurrentSession()
                .createQuery("from Employee");
        List<Employee> employees = query.list();
        return employees;
    }
}
