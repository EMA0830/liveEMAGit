package com.demo.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @Value(value = "${data.exception.message1}")
    private String message1;
    @Value(value = "${data.exception.message2}")
    private String message2;
    @Value(value = "${data.exception.message3}")
    private String message3;
    @Value(value = "${data.exception.message4}")
    private String message4;

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity EmployeeNotFoundException(EmployeeNotFoundException EmployeeNotFoundException) {
        return new ResponseEntity<String>(message2, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = NoEmployeesFoundException.class)
    public ResponseEntity NoEmployeesFoundException(NoEmployeesFoundException noEmployeesFoundException) {
        return new ResponseEntity<String>(message4, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = EmployeeAlreadyExistsException.class)
    public ResponseEntity employeeAlreadyExistsException(EmployeeAlreadyExistsException employeeAlreadyExistsException) {
        return new ResponseEntity<String>(message2, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> databaseConnectionFailsException(Exception exception) {
        return new ResponseEntity<>(message3, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
