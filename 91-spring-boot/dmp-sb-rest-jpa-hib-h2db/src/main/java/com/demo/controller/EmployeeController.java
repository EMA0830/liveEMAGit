package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;
import com.demo.service.EmployeeService;

//restful web service
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employees")
    public ResponseEntity saveEmployee(@RequestBody Employee employee) throws EmployeeAlreadyExistsException {
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/employees")
    public ResponseEntity<List> getAllEmployees() throws EmployeeNotFoundException {
        return new ResponseEntity<List>((List) employeeService.getAllEmployees(), HttpStatus.OK);
    }
    @GetMapping("employees/{id}")
    public ResponseEntity getEmployeeById(@PathVariable("id") Long id) throws EmployeeNotFoundException {
        return new ResponseEntity(employeeService.getEmployeeById(id), HttpStatus.OK);
    }
//    Traditional try-catch Block
//    @GetMapping("employees/tra/{id}")
//    public ResponseEntity getEmployeeByIdTry(@PathVariable("id") Long id) throws EmployeeNotFoundException { 
//        try{
//        	  return new ResponseEntity(employeeService.getEmployeeById(id), HttpStatus.OK);
//         }
//        catch(EmployeeNotFoundException employeeNotFoundException ){
//          return new ResponseEntity(employeeNotFoundException.getMessage(), HttpStatus.CONFLICT);
//         }
//    }    
}