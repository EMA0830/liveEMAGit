package com.demo.exception;
public class NoEmployeesFoundException extends RuntimeException {
    private String message;
    public NoEmployeesFoundException(String message) {
        super(message);
        this.message = message;
    }
    public NoEmployeesFoundException() {
    }
}