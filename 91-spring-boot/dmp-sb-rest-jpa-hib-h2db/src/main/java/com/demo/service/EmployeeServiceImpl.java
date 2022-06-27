package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;
import com.demo.exception.NoEmployeesFoundException;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            throw new EmployeeAlreadyExistsException();
        }
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
    @Override
    public List getAllEmployees() {
    	 List<Employee> employeesList =  employeeRepository.findAll();
    	 if(employeesList.size() > 0) {
    		 return employeesList;
    	 }else {
			throw new NoEmployeesFoundException();
		}
    }
    @Override
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException {
        Employee employee;
        if (employeeRepository.findById(id).isEmpty()) {
            throw new EmployeeNotFoundException();
        } else {
            employee = employeeRepository.findById(id).get();
        }
        return employee;
    }
}