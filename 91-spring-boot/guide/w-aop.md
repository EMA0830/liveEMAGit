:beginner: _**AOP**_  

:zero: _pom_  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.0.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.demo</groupId>
	<artifactId>d2-sb-aop</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>d2-sb-aop</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>1.8</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

```

:one: _model_  
```java
package com.domain.model;

public class Employee {
	private String empId;
	private String name;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
```
:two: _service_  
```java
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
//	public void deleteEmployee(String empId) {
//		System.err.println("Delete employee from DB");
//	}
}

```
:three: _controller_  
```java
package com.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.model.Employee;
import com.domain.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/add")
	public Employee createEmployee() {
		return employeeService.createEmployee();
	}
}

```
:four: _aspect_  
```java
package com.domain.aspect;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceLoggingAspect {
	@Before(value="execution(* com.domain.service.EmployeeService.*())")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.err.println("Before method : " + LocalTime.now() + " " + joinPoint.getSignature());
	}
	@After(value="execution(* com.domain.service.EmployeeService.*())")
	public void afterAdvice(JoinPoint joinPoint) {
		System.err.println("After method : " + LocalTime.now() + " " + joinPoint.getSignature());
	}
}

```

:five: _enable aop_  
```java
package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class D2SbAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2SbAopApplication.class, args);
	}

}

```
