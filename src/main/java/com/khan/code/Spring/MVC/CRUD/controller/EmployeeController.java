package com.khan.code.Spring.MVC.CRUD.controller;

import com.khan.code.Spring.MVC.CRUD.entity.Employee;
import com.khan.code.Spring.MVC.CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listOfEmployees(Model theModel) {

        List<Employee> theEmployee = employeeService.findAll();
        theModel.addAttribute("employees", theEmployee);


        return "list-employees";
    }


}
