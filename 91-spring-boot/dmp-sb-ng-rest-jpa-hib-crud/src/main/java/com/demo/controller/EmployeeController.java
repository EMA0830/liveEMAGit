package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;

//restful web service
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	  @GetMapping("/employees")
	  public List<Employee> getAllEmployees() {
	    return employeeRepository.findAll();
	  }
	
	  @GetMapping("/employees/{id}")
	  public Optional<Employee> getAllEmployeeById(@PathVariable (value="id") Long employeeId) {
	  Optional<Employee> employee =  employeeRepository.findById(employeeId);
	    return employee;
	  }
}
