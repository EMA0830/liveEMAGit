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

import com.demo.entity.NgEmployee;
import com.demo.repository.NgEmployeeRepository;

//restful web service
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ngapi")
public class NgEmployeeController {
	@Autowired
	private NgEmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<NgEmployee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/employees/{id}")
	public NgEmployee geNgEmployeetEmployeeById(@PathVariable(value = "id") Long employeeId) {
		NgEmployee employee = employeeRepository.findById(employeeId).get();
		return employee;
	}

	@PostMapping("/employees")
	public NgEmployee createEmployee(@RequestBody NgEmployee employee) {
		System.err.println(employee);
		return employeeRepository.save(employee);
	}

	@PutMapping("/employees/{id}")
	public NgEmployee updateEmployee(@PathVariable(value = "id") Long employeeId,
			@RequestBody NgEmployee employeeFromClient) {
		NgEmployee employeeFromDB = employeeRepository.findById(employeeId).get();
		employeeFromDB.setName(employeeFromClient.getName());
		employeeFromDB.setSalary(employeeFromClient.getSalary());
		return employeeRepository.save(employeeFromDB);
	}

	@DeleteMapping("/employees/{id}")
	public NgEmployee deleteEmployee(@PathVariable(value = "id") Long employeeId) {
		NgEmployee employee = employeeRepository.findById(employeeId).get();
		employeeRepository.delete(employee);
		return employee;
	}
}
