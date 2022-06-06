package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;

//restful web service
@CrossOrigin(origins = "http://localhost:4200")
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
	public Employee getEmployeeById(@PathVariable(value = "id") Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		return employee;
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.err.println(employee);
		return employeeRepository.save(employee);
	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(value = "id") Long employeeId,
			@RequestBody Employee employeeFromClient) {
		Employee employeeFromDB = employeeRepository.findById(employeeId).get();
		employeeFromDB.setFirstName(employeeFromClient.getFirstName());
		employeeFromDB.setLastName(employeeFromClient.getLastName());
		employeeFromDB.setEmailId(employeeFromClient.getEmailId());
		return employeeRepository.save(employeeFromDB);
	}

	@DeleteMapping("/employees/{id}")
	public Employee deleteEmployee(@PathVariable(value = "id") Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		employeeRepository.delete(employee);
		return employee;
	}
}
