package com.khan.code.Spring.MVC.CRUD.service;


import com.khan.code.Spring.MVC.CRUD.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
