package com.demo.service;
import java.util.List;

import com.demo.entity.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;
public interface EmployeeService {
    Employee saveEmployee(Employee employee) throws EmployeeAlreadyExistsException;
    List getAllEmployees() throws EmployeeNotFoundException;
    Employee getEmployeeById(Long id) throws EmployeeNotFoundException;
}