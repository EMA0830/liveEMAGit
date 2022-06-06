package com.domain.service;

import org.springframework.stereotype.Service;

import com.domain.model.Employee;

@Service
public class EmployeeService {
	public Employee createEmployee() {

		System.err.println("Creating an employee");
		Employee emp = new Employee();
		emp.setName("Rambo");
		emp.setEmpId("E1");
		return emp;
	}

}
