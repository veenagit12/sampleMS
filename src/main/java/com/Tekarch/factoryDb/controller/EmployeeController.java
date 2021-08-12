package com.Tekarch.factoryDb.controller;


import com.Tekarch.factoryDb.entity.Employee;
import com.Tekarch.factoryDb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value="/employee")
    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    @PostMapping(value ="/employee")
    public Employee addNewEmployee(@RequestBody Employee e1)
    {
        return employeeRepository.save(e1);
    }
    //new method added

}
