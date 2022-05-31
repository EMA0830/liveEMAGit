package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping("welcomeString")
	public String welcome() {
		return "Welcome to EMS";
	}

	@GetMapping("welcomeHTML")
	public String welcomeHTML() {
		return "<h1 style='color:red'>Welcome to EMS</h1>";
	}

	@GetMapping("employeesStubString")
	public String getEmployees() {
		return new Employee(1L,"Rambo2", "John2", "r2@r.com").toString() + "</br>"  +
				new Employee(2L,"Rambo3", "John3", "r3@r.com").toString();
	}
	@GetMapping("employeesStubList")
	public List<Employee> getEmployeesStubList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1L,"Rambo2", "John2", "r2@r.com"));
		employeeList.add(new Employee(2L,"Rambo3", "John3", "r3@r.com"));
		return employeeList;
	}
	
	@GetMapping("getEmployeesFromRepo")
	public List<Employee> getEmployeesFromRepo() {
		return employeeRepository.findAll();
	}
}
