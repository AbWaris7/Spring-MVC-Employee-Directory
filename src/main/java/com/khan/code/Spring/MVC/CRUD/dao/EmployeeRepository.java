package com.khan.code.Spring.MVC.CRUD.dao;

import com.khan.code.Spring.MVC.CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // sort by last name

    public List<Employee> findAllByOrderByFirstNameAsc();

}